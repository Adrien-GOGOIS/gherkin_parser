package expression.declaration;

import expression.Expression;

public class FeatureDeclaration extends Expression {

    final String text;
    final String type;
    final String position;
    FeatureHeader header;
    FeatureBody body;

    public FeatureDeclaration(String text, String type, String position, FeatureHeader header, FeatureBody body) {
        super(text, type, position);
        this.header = header;
        this.body = body;
        this.text = text;
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        return type + ":\n" + text + "\nPosition : " + position;
    }
}
