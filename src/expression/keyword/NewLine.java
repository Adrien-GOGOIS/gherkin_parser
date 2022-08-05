package expression.keyword;

import expression.Expression;

public class NewLine extends Expression {
    String newLine = "\n";

    public NewLine(String text, String type, String position, String newLine) {
        super(text, type, position);
        this.newLine = newLine;
    }

    @Override
    public String toString() {
        return newLine;
    }
}
