public tool.math.Edge join(tool.math.Node node) {
    tool.math.Edge edge = new tool.math.Edge(this, node);
    addOut(edge);
    node.addIn(edge);
    return edge;
}