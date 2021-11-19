public void setOnNode(project.Node n) {
    prevNode = onNode;
    onNode = n;
    x = n.getX();
    y = n.getY();
}