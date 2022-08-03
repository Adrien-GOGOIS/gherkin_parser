package expression.declaration;

import expression.Expression;

public class FeatureBody extends Expression {
    ScenarioDeclaration scenario;
    OutlineScenarioDeclaration outlineScenario;

    public FeatureBody(ScenarioDeclaration scenario, OutlineScenarioDeclaration outlineScenario) {
        this.scenario = scenario;
        this.outlineScenario = outlineScenario;
    }
}
