public void insertUnexploredNode(Point pt) {
    Node n = new Node(false, pt);
    map.put(n.toString(), n);
}