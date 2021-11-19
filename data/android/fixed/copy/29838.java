private SinglyLinkedList<Item>.Node node(int index) {
    SinglyLinkedList<Item>.Node x = first;
    for (int i = 1; i < index; i++)
        x = x.next;
    
    return x;
}