package expression.declaration;

import expression.Expression;

import java.util.List;

public class RestOfLine extends Expression {
    public List<String> line;
    StringBuilder str = new StringBuilder();

    public RestOfLine(List<String> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        for (String word : line) {
            str.append(word).append("-");
        }
        return str.toString();
    }
}
