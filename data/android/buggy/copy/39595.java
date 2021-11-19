public void setExpressionParts(java.util.List<@org.eclipse.jdt.annotation.NonNull
E> expressionParts) {
    synchronized(this) {
        this.expressionParts = java.util.Collections.unmodifiableList(new java.util.LinkedList<>(expressionParts));
    }
}