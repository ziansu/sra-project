public final void traverseMemberDec(net.unicoen.node.UniMemberDec node) {
    if (node instanceof net.unicoen.node.UniMethodDec) {
        traverseMethodDec(((net.unicoen.node.UniMethodDec) (node)));
    }
    throw new java.lang.RuntimeException(("Unknown node: " + node));
}