private void loadGraph() {
    graph = mSpec.getGraph();
    layout.setGraph(graph);
    mSpec.updateLayout(layout);
    initGraphVisibility();
    snapViewToVisible();
}