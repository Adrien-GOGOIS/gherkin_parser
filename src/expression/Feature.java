package expression;

import java.util.ArrayList;
import java.util.List;

public class Feature {
    public List<Expression> expressions;

    public Feature() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression e) {
        expressions.add(e);
    }
}
