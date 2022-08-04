package expression.declaration;

import expression.Expression;
import expression.keyword.Scenario;
import expression.keyword.Title;

public class OutlineScenarioDeclaration extends Expression {
    Scenario scenario;
    Title title;
    BlockBody blockBody;

    public OutlineScenarioDeclaration(Scenario scenario, Title title, BlockBody blockBody) {
        this.scenario = scenario;
        this.title = title;
        this.blockBody = blockBody;
    }

    @Override
    public String toString() {
        return scenario.toString() + " Titre : " + title.toString();
    }
}
