package expression.declaration;

import expression.Expression;

import java.util.List;

public class BlockBody extends Expression {
    List <RestOfLine> restOfLines;

    public BlockBody() {}

    public BlockBody (List<RestOfLine> restOfLines) {
        this.restOfLines = restOfLines;
    }
}
