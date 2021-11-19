public void flagConnected() {
    for (Graph.Edge e : adj) {
        e.e.flag = flag;
        e.e.flagConnected();
    }
}