package expression.keyword;

import expression.Expression;

public class Title extends Expression {

    final String text;
    final String type;
    final String position;

    public Title(String text, String type, String position) {
        super(text, type, position);
        this.text = text;
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        return type + ": " + text + "\nPosition : " + position;
    }
}
