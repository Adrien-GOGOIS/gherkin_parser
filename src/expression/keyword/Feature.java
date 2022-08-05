package expression.keyword;

import expression.Expression;

public class Feature extends Expression {
    String feature = "Feature:";

    public Feature(String text, String type, String position, String feature) {
        super(text, type, position);
        this.feature = feature;
    }

    @Override
    public String toString() {

        return feature;
    }
}
