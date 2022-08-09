package expression;

import antlr.ExprParser;
import org.antlr.v4.runtime.*;

public class CustomErrorHandler extends DefaultErrorStrategy {
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        if (e instanceof InputMismatchException) {
            int type = recognizer.getInputStream().LA(1);
            while (type == ExprParser.ERR_TOKEN) {
                recognizer.consume();
                type = recognizer.getInputStream().LA(1);
            }
        } else {
            super.recover(recognizer, e);
        }
    }
}
