package expression.keyword;

import expression.Expression;

public class Scenario extends Expression {
    String scenario = "Scenario:";

    @Override
    public String toString() {
        return scenario;
    }
}
