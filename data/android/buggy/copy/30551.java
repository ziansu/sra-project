@java.lang.Override
public generator.Instruction visitPass(generator.Pass node) {
    generator.Nop nop = new generator.Nop();
    program.addInstruction(nop);
    return nop;
}