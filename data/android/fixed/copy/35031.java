@java.lang.Override
public boolean visit(org.eclipse.jdt.core.dom.EnhancedForStatement node) {
    if (edu.cuny.citytech.foreachlooptolambda.ui.visitors.EnhancedForStatementVisitor.contains(node.getBody())) {
        this.encounteredEmbeddedLoop = true;
    }
    return super.visit(node);
}