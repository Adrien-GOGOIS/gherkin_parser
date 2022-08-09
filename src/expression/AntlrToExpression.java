package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import expression.declaration.*;
import expression.keyword.Feature;
import expression.keyword.Scenario;
import expression.keyword.Title;
import expression.keyword.Word;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends ExprBaseVisitor<Expression> {

    private final List<String> variables; // Stock les titres de scenario et feature entrés dans le programme
    private final List<String> semanticErrors; // 1. Duplicate 2. Reference to undeclared variable

    public AntlrToExpression(List<String> semanticErrors) {
        variables = new ArrayList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitFeatureHeader(ExprParser.FeatureHeaderContext ctx) {
        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        Expression feature = visit(ctx.Feature());
        Expression title = visit(ctx.title());
        return new FeatureHeader(ctx.getText(), "FeatureHeader", position, (Feature) feature, (Title) title);
    }

    @Override
    public Expression visitFeatureBody(ExprParser.FeatureBodyContext ctx) {
        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        List<Expression> scenarios = new ArrayList<>();
        for (int i = 0; i < ctx.scenario().size(); i++) {
            scenarios.add(visit(ctx.getChild(i)));
        }
        List<Expression> outlineScenarios = new ArrayList<>();
        for (int i = 0; i < ctx.outlineScenario().size(); i++) {
            outlineScenarios.add(visit(ctx.getChild(i)));
        }
        return new FeatureBody(ctx.getText(), "FeatureBody", position, scenarios, outlineScenarios);
    }

    @Override
    public Expression visitScenarioDeclaration(ExprParser.ScenarioDeclarationContext ctx) {

        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        Expression scenario = visit(ctx.Scenario());
        Expression title = visit(ctx.title());
        Expression blockBody = visit(ctx.blockBody());
        return new ScenarioDeclaration(ctx.getText(), "ScenarioDeclaration", position, (Scenario) scenario, (Title) title, (BlockBody) blockBody);
    }

    @Override
    public Expression visitOutlineScenarioDeclaration(ExprParser.OutlineScenarioDeclarationContext ctx) {
        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        Expression scenario = visit(ctx.ScenarioOutline());
        Expression title = visit(ctx.title());
        Expression blockBody = visit(ctx.blockBody());
        return new OutlineScenarioDeclaration(ctx.getText(), "OutlineScenarioDeclaration", position, (Scenario) scenario, (Title) title, (BlockBody) blockBody);
    }

    @Override
    public Expression visitTitleDeclaration(ExprParser.TitleDeclarationContext ctx) {

        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        String id = ctx.getText();

        if (variables.contains((id))) {
            semanticErrors.add("Error : title >>" + id + " << already declared at " + position);
        } else {
            variables.add(id);
        }

        return new Title(id, "title", position);
    }

    @Override
    public Expression visitBlockBodyDeclaration(ExprParser.BlockBodyDeclarationContext ctx) {
        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        return new BlockBody(ctx.getText(), "BlockBodyDeclaration", position, null);
    }

    @Override
    public Expression visitRestOfLineDeclaration(ExprParser.RestOfLineDeclarationContext ctx) {
        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        return new RestOfLine(ctx.getText(), "restOfLine", position);
    }

    @Override
    public Expression visitWordDeclaration(ExprParser.WordDeclarationContext ctx) {
        String position = ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        return new Word(ctx.getText(), "word", position);
    }


}
