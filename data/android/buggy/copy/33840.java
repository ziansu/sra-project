void insertNode(server.TaskList.Node currentNode, server.TaskList.Node newNode) {
    currentNode.isLocked = true;
    synchronized(currentNode) {
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    startTask(newNode);
    currentNode.isLocked = false;
}