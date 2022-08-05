package expression.declaration;

import expression.Expression;

import java.util.List;

public class BlockBody extends Expression {
    List <RestOfLine> restOfLines;

    final String text;
    final String type;
    final String position;

    public BlockBody(String text, String type, String position, List<RestOfLine> restOfLines) {
        super(text, type, position);
        this.restOfLines = restOfLines;
        this.text = text;
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        return type + ": " + text + "\nPosition : " + position;
    }
}
