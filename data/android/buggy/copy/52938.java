protected org.eclipse.jdt.core.dom.MethodDeclaration getMethodDeclaration(org.eclipse.jdt.core.dom.ASTNode node) {
    if ((node.getParent()) != null) {
        return node instanceof org.eclipse.jdt.core.dom.MethodDeclaration ? ((org.eclipse.jdt.core.dom.MethodDeclaration) (node)) : getMethodDeclaration(node.getParent());
    }
    return null;
}