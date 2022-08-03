package expression.keyword;

import expression.Expression;

public class ScenarioOutline extends Expression {
    String scenarioOutline = "Scenario Outline:";

    @Override
    public String toString() {
        return scenarioOutline;
    }
}
