private void removeNode(ast.ASTNode node) {
    ast.ASTNode parent = node.getParent();
    if (parent != null)
        parent.removeChild(parent.getIndexOfChild(node));
    
}