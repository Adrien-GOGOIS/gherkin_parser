package expression.declaration;

import expression.Expression;

import java.util.List;

public class FeatureBody extends Expression {

    final String text;
    final String type;
    final String position;
    List<Expression> scenarios;
    List<Expression> outlineScenarios;

    public FeatureBody(String text, String type, String position, List<Expression> scenarios, List<Expression> outlineScenarios) {
        super(text, type, position);
        this.scenarios = scenarios;
        this.outlineScenarios = outlineScenarios;
        this.text = text;
        this.type = type;
        this.position = position;
    }

    @Override
    public String toString() {
        return type + ": " + text + "\nPosition : " + position;
    }
}
