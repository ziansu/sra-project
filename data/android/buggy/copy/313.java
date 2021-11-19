public void visit(com.google.devtools.build.lib.syntax.ConditionalExpression node) {
    visit(node.getThenCase());
    visit(node.getCondition());
    if ((node.getElseCase()) != null) {
        visit(node.getElseCase());
    }
}