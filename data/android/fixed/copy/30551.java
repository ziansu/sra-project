@java.lang.Override
public generator.Instruction visitPass(generator.Pass node) {
    return addInstruction(new generator.Nop());
}