@java.lang.Override
public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
    if (n.isSuper()) {
        visitSuper(n, parent);
    }
}