package expression.keyword;

import expression.Expression;

public class NewLine extends Expression {
    String newLine = "\n";

    @Override
    public String toString() {
        return newLine;
    }
}
