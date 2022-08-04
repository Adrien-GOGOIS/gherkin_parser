package expression;
import expression.declaration.RestOfLine;
import expression.declaration.ScenarioDeclaration;
import expression.keyword.Scenario;

import java.util.ArrayList;
import java.util.List;

public class ExpressionProcessor {
    List<Expression> list;

    public ExpressionProcessor(List<Expression> list) {
        this.list = list;
    }

    public List<String> displayExpression() {
        List<String> evaluations = new ArrayList<>();

        for (Expression e : list) {
            if (e instanceof RestOfLine) {
                RestOfLine declaration = (RestOfLine) e;
                evaluations.add("Rest of line : " + declaration);
            }

            if (e instanceof ScenarioDeclaration) {
                ScenarioDeclaration declaration = (ScenarioDeclaration) e;
                evaluations.add(declaration.toString());
            }
        }
        return evaluations;
    }
}
