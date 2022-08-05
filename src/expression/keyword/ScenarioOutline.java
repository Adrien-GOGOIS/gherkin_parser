package expression.keyword;

import expression.Expression;

public class ScenarioOutline extends Expression {
    String scenarioOutline = "Scenario Outline:";

    public ScenarioOutline(String text, String type, String position, String scenarioOutline) {
        super(text, type, position);
        this.scenarioOutline = scenarioOutline;
    }

    @Override
    public String toString() {
        return scenarioOutline;
    }
}
