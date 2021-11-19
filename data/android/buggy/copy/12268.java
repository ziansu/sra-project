public expression.ExprOperand set(regs.PositionRegister pReg, int i, int j) {
    type = ExpressionElement.PREG_IDX;
    setRegIdx(i);
    posIdx = j;
    regVal = pReg;
    return this;
}