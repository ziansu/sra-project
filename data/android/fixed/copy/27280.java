public expression.ExprOperand reset() {
    type = ExpressionElement.UNINIT;
    regVal = null;
    pointVal = null;
    return this;
}