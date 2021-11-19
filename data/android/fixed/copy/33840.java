void insertNode(server.TaskList.Node currentNode, server.TaskList.Node newNode) {
    currentNode.isLocked.set(true);
    synchronized(currentNode) {
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    currentNode.isLocked.set(false);
    startTask(newNode);
}