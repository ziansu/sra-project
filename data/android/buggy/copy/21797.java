public void addException(com.github.javaparser.ast.type.Type t, com.github.javaparser.ast.expr.Expression e) {
    for (Contract.Behavior b : getLeafs(currentBehavior)) {
        currentBehavior.addException(t, e);
    }
}