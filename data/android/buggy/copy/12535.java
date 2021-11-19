private void writeAssert(int indent, wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Assert> c, java.io.PrintWriter out) {
    out.print("wyjs.assert(");
    writeExpression(c.getOperand(0), out);
    out.println(");");
}