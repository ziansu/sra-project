@java.lang.Override
public void setTraversal(final org.apache.tinkerpop.gremlin.process.traversal.Traversal.Admin<?, ?> parentTraversal) {
    super.setTraversal(parentTraversal);
    integrateChild(this.dedupTraversal);
}