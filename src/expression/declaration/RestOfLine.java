package expression.declaration;

import expression.Expression;
import expression.keyword.Word;

import java.util.List;

public class RestOfLine extends Expression {
    List<Word> line;

    public RestOfLine (List<Word> line) {
        this.line = line;
    }
}
