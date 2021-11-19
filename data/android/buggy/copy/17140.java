@java.lang.Override
public com.javaclasses.service.ExpressionState checkFinalState(com.javaclasses.service.ExpressionState expressionState, com.javaclasses.InputDataReader inputDataReader, com.javaclasses.Result result) {
    if ((inputDataReader.getExpression().length()) == (result.getIndex())) {
        return ExpressionState.FINISH;
    }
    return expressionState;
}