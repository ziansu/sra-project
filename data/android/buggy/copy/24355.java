public void revalidate() {
    frame.remove(graph);
    getGraph();
    frame.add(graph);
    frame.revalidate();
}