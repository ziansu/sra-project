public void visitDouble(nez.ast.jcode.JCodeTree p) {
    this.mBuilder.push(java.lang.Double.parseDouble(p.getText()));
}