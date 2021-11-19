private void createNewHeadNode(int nodeData) {
    com.colabug.Node node = new com.colabug.Node(nodeData, null);
    head = node;
    tail = head;
}