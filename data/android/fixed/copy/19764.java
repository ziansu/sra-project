protected void addNode(org.gephi.graph.impl.NodeImpl node) {
    if ((views.length) > 0) {
        for (org.gephi.graph.impl.GraphViewImpl view : views) {
            if (view != null) {
                view.ensureNodeVectorSize(node);
            }
        }
    }
}