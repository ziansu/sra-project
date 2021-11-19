@java.lang.Override
public void exitProgram(@org.antlr.v4.runtime.misc.NotNull
pp.finalproject.GrammarParser.ProgramContext ctx) {
    emit(OpCode.ENDPROG);
    super.exitProgram(ctx);
}