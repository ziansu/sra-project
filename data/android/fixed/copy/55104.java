public void add(ProjectSahara.Edge edge) {
    this.weight += edge.getWeight();
    path.add(edge.getTargetNode());
}