public expression.ExprOperand set(regs.PositionRegister pReg) {
    if ((type) != (ExpressionElement.PREG_IDX))
        type = ExpressionElement.PREG;
    
    regVal = pReg;
    return this;
}