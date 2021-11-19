public void setNodes(java.util.List<org.esn.mobilit.models.Node> nodes, org.esn.mobilit.models.Node currentNode) {
    this.nodes = nodes;
    this.currentNode = currentNode;
    this.notifyDataSetChanged();
}