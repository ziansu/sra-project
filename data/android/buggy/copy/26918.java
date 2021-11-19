@java.lang.Override
public generator.Instruction visitSpidExpression(generator.SpidExpression node) {
    regs.setReg(node, Register.SPROCKELL_ID);
    generator.Nop nop = new generator.Nop();
    program.addInstruction(nop);
    return nop;
}