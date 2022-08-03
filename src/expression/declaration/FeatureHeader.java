package expression.declaration;

import expression.Expression;
import expression.keyword.Feature;

public class FeatureHeader extends Expression {
    Feature feature;
    RestOfLine restOfLine;

    public FeatureHeader(Feature feature, RestOfLine restOfLine) {
        this.feature = feature;
        this.restOfLine = restOfLine;
    }
}
