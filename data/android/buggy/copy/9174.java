@java.lang.Override
public java.lang.Object visitProgram(ProgramContext ctx) {
    java.lang.System.out.println("TYPE CHECKING");
    java.lang.System.out.println("-------------");
    return visitChildren(ctx);
}