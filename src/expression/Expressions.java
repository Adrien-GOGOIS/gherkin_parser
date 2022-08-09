package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;

import java.util.ArrayList;
import java.util.List;

public class Expressions extends ExprBaseVisitor<Feature> {

    public List<String> semanticErrors;

    @Override
    public Feature visitFeatureDeclaration(ExprParser.FeatureDeclarationContext ctx) {
        Feature feature = new Feature();
        semanticErrors = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression(semanticErrors);

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i != ctx.getChildCount() - 1) {
                // Last child of the start symbol program is EOF -> Do not visit this child and try to convert into an Expression object
                feature.addExpression(expressionVisitor.visit(ctx.getChild(i)));
            }
        }
        return feature;
    }
}
