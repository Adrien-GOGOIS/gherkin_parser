package expression.declaration;

import expression.Expression;
import expression.keyword.Word;

import java.util.List;

public class RestOfLine extends Expression {

    final String text;
    final String type;
    final String position;
    //List<Word> words;

    public RestOfLine(String text, String type, String position) {
        super(text, type, position);
        this.text = text;
        this.type = type;
        this.position = position;
        //this.words = words;
    }

    @Override
    public String toString() {
        return type + ": " + text + "\nPosition : " + position;
    }
}
