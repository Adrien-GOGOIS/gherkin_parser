package expression.keyword;

import expression.Expression;

public class Space extends Expression {
    String space = " ";

    public Space(String text, String type, String position, String space) {
        super(text, type, position);
        this.space = space;
    }

    @Override
    public String toString() {
        return space;
    }
}
