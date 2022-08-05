package expression.declaration;

import expression.Expression;
import expression.keyword.Scenario;
import expression.keyword.Title;

public class ScenarioDeclaration extends Expression {

    final String text;
    final String type;
    final String position;
    Scenario scenario;
    Title title;
    BlockBody blockBody;

    public ScenarioDeclaration(String text, String type, String position, Scenario scenario, Title title, BlockBody blockBody) {
        super(text, type, position);
        this.scenario = scenario;
        this.title = title;
        this.blockBody = blockBody;
        this.text = text;
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        return type + ": " + text + "\nPosition : " + position;
    }
}
