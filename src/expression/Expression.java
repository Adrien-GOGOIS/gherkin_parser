package expression;

public class Expression {

    final String text;
    final String type;
    final String position;

    public Expression(String text, String type, String position) {
        this.text = text;
        this.type = type;
        this.position = position;
    }
}
