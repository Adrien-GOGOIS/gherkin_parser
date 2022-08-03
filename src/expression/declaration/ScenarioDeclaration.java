package expression.declaration;

import expression.Expression;
import expression.keyword.Scenario;

public class ScenarioDeclaration extends Expression {
    Scenario scenario;
    RestOfLine restOfLine;
    BlockBody blockBody;

    public ScenarioDeclaration(Scenario scenario, RestOfLine restOfLine, BlockBody blockBody) {
        this.scenario = scenario;
        this.restOfLine = restOfLine;
        this.blockBody = blockBody;
    }
}
