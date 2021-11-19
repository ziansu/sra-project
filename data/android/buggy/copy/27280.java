public expression.ExprOperand reset() {
    type = ExpressionElement.UNINIT;
    setRegIdx((-1));
    regVal = null;
    pointVal = null;
    return this;
}