package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import expression.declaration.BlockBody;
import expression.declaration.RestOfLine;
import expression.declaration.ScenarioDeclaration;
import expression.keyword.Scenario;
import expression.keyword.Title;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends ExprBaseVisitor<Expression> {

    List<String> lines = new ArrayList<>();

    @Override
    public Expression visitRestOfLineDeclaration(ExprParser.RestOfLineDeclarationContext ctx) {
        System.out.println(ctx.getChild(1));
        lines.add(ctx.getText());
        return new RestOfLine(lines);
    }

    @Override
    public Expression visitFeatureDeclaration(ExprParser.FeatureDeclarationContext ctx) {
        //System.out.println("Feature : " + ctx.featHeader().getText());
        return super.visitFeatureDeclaration(ctx);
    }

    @Override
    public Expression visitFeatureHeader(ExprParser.FeatureHeaderContext ctx) {
        //System.out.println("CTX feature header : " + ctx.Feature().getText() + " ++ " + ctx.restOfLine().getText());
        return super.visitFeatureHeader(ctx);
    }

    @Override
    public Expression visitFeatureBody(ExprParser.FeatureBodyContext ctx) {
        //System.out.println("CTX Feature Body : " + ctx.scenario(1).getText());
        return super.visitFeatureBody(ctx);
    }

    @Override
    public Expression visitBlockBodyDeclaration(ExprParser.BlockBodyDeclarationContext ctx) {
        //System.out.println("CTX BLOCK BODY");
        return super.visitBlockBodyDeclaration(ctx);
    }

    @Override
    public Expression visitScenarioDeclaration(ExprParser.ScenarioDeclarationContext ctx) {
        /* Scenario scenario = new Scenario();
        Title title = new Title(ctx.title().getText());
        BlockBody blockBody = new BlockBody();

        return new ScenarioDeclaration(scenario, title, blockBody); */
        return super.visitScenarioDeclaration(ctx);
    }

    @Override
    public Expression visitOutlineScenarioDeclaration(ExprParser.OutlineScenarioDeclarationContext ctx) {
        return super.visitOutlineScenarioDeclaration(ctx);
    }
}
