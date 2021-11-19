public void visit(com.google.devtools.build.lib.syntax.AugmentedAssignmentStatement node) {
    visit(node.getExpression());
    visit(node.getLValue());
}