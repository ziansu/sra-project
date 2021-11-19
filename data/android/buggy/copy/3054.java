public expression.ExprOperand set(regs.DataRegister dReg, int i) {
    type = ExpressionElement.DREG;
    setRegIdx(i);
    regVal = dReg;
    return this;
}