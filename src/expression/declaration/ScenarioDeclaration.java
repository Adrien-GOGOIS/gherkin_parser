package expression.declaration;

import expression.Expression;
import expression.keyword.Scenario;
import expression.keyword.Title;

public class ScenarioDeclaration extends Expression {
    Scenario scenario;
    Title title;
    BlockBody blockBody;

    public ScenarioDeclaration(Scenario scenario, Title title, BlockBody blockBody) {
        this.scenario = scenario;
        this.title = title;
        this.blockBody = blockBody;
    }

    @Override
    public String toString() {
        return scenario.toString() + " Titre : " + title.toString();
    }
}
