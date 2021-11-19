@java.lang.Override
public void enterWrite_stmt(littleCompiler.LittleParser.Write_stmtContext ctx) {
    exprStack.push(new littleCompiler.StmtList());
}