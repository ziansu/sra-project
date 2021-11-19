public void flagConnected() {
    for (Graph.Edge e : adj) {
        if ((e.e.flag) == (-1)) {
            e.e.flag = flag;
            e.e.flagConnected();
        }
    }
}