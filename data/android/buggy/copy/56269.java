private boolean addNodeToEmptyList(java.lang.Object o) {
    week3.linkedList.MyLinkedList.Node newNode = new week3.linkedList.MyLinkedList.Node(o);
    if (isEmpty()) {
        head = tail = newNode;
        return true;
    }else
        return false;
    
}