public void setGraph(edu.cmu.tetradapp.model.Graph graph) {
    graphs = new java.util.ArrayList<>();
    graphs.add(new edu.cmu.tetradapp.model.SemGraph(graph));
    log();
}