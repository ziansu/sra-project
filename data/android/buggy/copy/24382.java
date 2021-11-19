public void addOperator(char op) throws com.github.gianlucanitti.javaexpreval.UnexpectedTokenException {
    if (!(expectOperator))
        throw new com.github.gianlucanitti.javaexpreval.UnexpectedTokenException(expectOperator);
    
    operators.add(op);
    expectOperator = false;
}