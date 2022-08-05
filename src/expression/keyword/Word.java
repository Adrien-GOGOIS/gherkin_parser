package expression.keyword;

import expression.Expression;

public class Word extends Expression {
    final String text;
    final String type;
    final String position;

    public Word(String text, String type, String position) {
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
