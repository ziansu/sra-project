private void removeEdge(rgraph.Edge e) {
    if (e == null) {
        return ;
    }
    e.removeFromNodes();
    edges.remove(e);
}