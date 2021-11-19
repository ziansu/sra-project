private void writeFieldLoadLVal(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.FieldLoad> expr) {
    writeLVal(expr.getOperand(0));
    out.print(("." + (expr.getBytecode().fieldName())));
}