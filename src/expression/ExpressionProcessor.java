package expression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionProcessor {
    List<Expression> list;

    public ExpressionProcessor(List<Expression> list) {
        this.list = list;
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();

        for (Expression e : list) {
            evaluations.add(e.toString());
        }
        return evaluations;
    }
}
