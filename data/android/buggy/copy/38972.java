private void writeConst(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Const> expr, java.io.PrintWriter out) {
    wyil.lang.Constant c = expr.getBytecode().constant();
    writeConstant(c);
}