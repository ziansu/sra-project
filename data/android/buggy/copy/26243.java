private void writeFieldLoadLVal(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.FieldLoad> expr, java.io.PrintWriter out) {
    writeLVal(expr.getOperand(0), out);
    out.print(("." + (expr.getBytecode().fieldName())));
}