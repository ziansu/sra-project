public void visit(com.google.devtools.build.lib.syntax.AugmentedAssignmentStatement node) {
    visit(node.getLValue());
    visit(node.getExpression());
}