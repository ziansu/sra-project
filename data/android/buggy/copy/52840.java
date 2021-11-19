@java.lang.Override
public generator.Instruction visitEndProgram(parsetree.stats.EndProgram node) {
    generator.Instruction result = new parsetree.stats.EndProgram();
    program.addInstruction(result);
    return result;
}