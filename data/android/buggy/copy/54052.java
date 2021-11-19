private boolean isUnaryOperator(int position) {
    calculator.AbstractOperator test = operators.get(position);
    if (test instanceof calculator.FactorialOperator) {
        return true;
    }
    return false;
}