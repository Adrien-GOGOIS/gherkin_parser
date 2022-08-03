package expression.declaration;

import expression.Expression;

public class FeatureDeclaration extends Expression {
    FeatureHeader header;
    FeatureBody body;

    public FeatureDeclaration(FeatureHeader header, FeatureBody body) {
        this.header = header;
        this.body = body;
    }
}
