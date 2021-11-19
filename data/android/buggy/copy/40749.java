public boolean visit(org.eclipse.jdt.core.dom.TypeDeclaration node) {
    className = node.getName().toString();
    return true;
}