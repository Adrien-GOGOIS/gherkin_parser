package expression.keyword;

import expression.Expression;

public class Feature extends Expression {
    String feature = "Feature:";

    @Override
    public String toString() {
        return feature;
    }
}
