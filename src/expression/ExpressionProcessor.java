package expression;
import java.util.List;

public class ExpressionProcessor {
    List<Expression> list;

    public ExpressionProcessor(List<Expression> list) {
        this.list = list;
    }

    public String displayExpression() {
        return list.get(0).toString();
    }
}
