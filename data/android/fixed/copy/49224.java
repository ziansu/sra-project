@java.lang.Override
public java.util.List<lupos.rif.generated.syntaxtree.INode> visit(final lupos.rif.generated.syntaxtree.RIFClause n, final java.lang.Object argu) {
    return this.list(n.f0.choice, n.f1.node);
}