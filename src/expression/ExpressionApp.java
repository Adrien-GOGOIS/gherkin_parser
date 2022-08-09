package expression;

import antlr.ExprLexer;
import antlr.ExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ExpressionApp {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("Usage: filename");
        } else {
            String filename = args[0];
            ExprParser parser = getParser(filename);

            // Tell ANTLR to build a parse tree
            // Parse from the start symbol : "prog"
            ParseTree antlrAST = parser.feature();

            // Create a visitor for converting the parse tree into Program/Expression object
            Expressions programVisitor = new Expressions();
            Feature feature = programVisitor.visit(antlrAST);

            ExpressionProcessor expressionProcessor = new ExpressionProcessor(feature.expressions);
            for (String evaluation : expressionProcessor.getEvaluationResults()) {
                System.out.println(evaluation);
            }

            for (String error : programVisitor.semanticErrors) {
                System.err.println(error);
            }
        }
    }

    private static ExprParser getParser(String filename) {
        ExprParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(filename);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new ExprParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListener());
            parser.setErrorHandler(new CustomErrorHandler());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}
