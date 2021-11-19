public java.lang.Void visit(org.kframework.kil.ASTNode node, java.lang.Void _void) {
    node.setLocation(org.kframework.parser.generator.UpdateLocationVisitor.updateLocation(currentStartLine, currentStartColumn, cachedStartColumn, cachedStartLine, node.getLocation()));
    return null;
}