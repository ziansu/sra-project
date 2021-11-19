private void loadGraph() {
    mSpec.updateLayout(layout);
    graph = mSpec.getGraph();
    layout.setGraph(graph);
    initGraphVisibility();
    snapViewToVisible();
}