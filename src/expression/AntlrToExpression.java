package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import expression.declaration.RestOfLine;
import expression.keyword.Word;

import java.util.ArrayList;
import java.util.List;

public class AntlrToExpression extends ExprBaseVisitor<Expression> {
    @Override
    public Expression visitRestOfLineDeclaration(ExprParser.RestOfLineDeclarationContext ctx) {
        String str = ctx.getText();
        List<Word> words = new ArrayList<>();
        words.add(new Word(str));
        return new RestOfLine(words);
    }
}
