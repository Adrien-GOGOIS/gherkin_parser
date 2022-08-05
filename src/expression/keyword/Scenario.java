package expression.keyword;

import expression.Expression;

public class Scenario extends Expression {
    String scenario = "Scenario:";

    public Scenario(String text, String type, String position, String scenario) {
        super(text, type, position);
        this.scenario = scenario;
    }

    @Override
    public String toString() {
        return scenario;
    }
}
