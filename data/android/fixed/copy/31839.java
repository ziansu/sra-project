public void visit(com.github.davityle.ngprocessor.attrcompiler.node.FunctionCall node) {
    for (com.github.davityle.ngprocessor.attrcompiler.node.Expression expression : node.getParameters()) {
        expression.accept(this);
    }
}