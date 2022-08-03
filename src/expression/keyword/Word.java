package expression.keyword;

import expression.Expression;

public class Word extends Expression {
    String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
