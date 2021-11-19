public synchronized com.amiyasahu.linkedlists.singly.ListNode removeFromBegin() {
    com.amiyasahu.linkedlists.singly.ListNode node = head;
    if (node != null) {
        head = node.getNext();
        node.setNext(null);
    }
    return node;
}