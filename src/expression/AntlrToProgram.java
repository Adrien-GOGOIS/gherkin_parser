package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;

public class AntlrToProgram extends ExprBaseVisitor<Program> {
    @Override
    public Program visitProgram(ExprParser.ProgramContext ctx) {
        Program program = new Program();
        AntlrToExpression expressionVisitor = new AntlrToExpression();

        for (int i =0; i < ctx.getChildCount(); i++) {
            if (i != ctx.getChildCount() - 1) {
                // Last child of the start symbol program is EOF -> Do not visit this child and try to convert into an Expression object
                program.addExpression(expressionVisitor.visit(ctx.getChild(i)));
            }
        }

        return program;
    }
}
