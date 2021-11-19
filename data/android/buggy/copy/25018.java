public void visit(com.google.devtools.build.lib.syntax.ForStatement node) {
    visit(node.getVariable());
    visit(node.getCollection());
    visitBlock(node.getBlock());
}