package expression.declaration;

import expression.Expression;
import expression.keyword.Word;

import java.util.ArrayList;
import java.util.List;

public class RestOfLine extends Expression {
    List<String> stringLine = new ArrayList<>();
    List<Word> words;

    public RestOfLine(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        for (Word word : words) {
            stringLine.add(word.toString());
        }
        return stringLine.get(0);
    }
}
