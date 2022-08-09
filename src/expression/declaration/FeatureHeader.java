package expression.declaration;

import expression.Expression;
import expression.keyword.Feature;
import expression.keyword.Title;

public class FeatureHeader extends Expression {

    final String text;
    final String type;
    final String position;
    Feature feature;
    Title restOfLine;

    public FeatureHeader(String text, String type, String position, Feature feature, Title title) {
        super(text, type, position);
        this.feature = feature;
        this.restOfLine = title;
        this.text = text;
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        return type + ":\n" + text + "\nPosition : " + position;
    }
}
