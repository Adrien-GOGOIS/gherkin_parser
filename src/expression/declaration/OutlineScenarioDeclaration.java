package expression.declaration;

import expression.Expression;
import expression.keyword.Scenario;

public class OutlineScenarioDeclaration extends Expression {
    Scenario scenario;
    RestOfLine restOfLine;
    BlockBody blockBody;

    public OutlineScenarioDeclaration(Scenario scenario, RestOfLine restOfLine, BlockBody blockBody) {
        this.scenario = scenario;
        this.restOfLine = restOfLine;
        this.blockBody = blockBody;
    }
}
