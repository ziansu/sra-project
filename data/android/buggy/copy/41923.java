public void append(int new_data) {
    LinkedList.Node new_node = new LinkedList.Node(new_data);
    LinkedList.Node temp = head;
    while ((temp.next) != null) {
        temp = temp.next;
    } 
    temp.next = new_node;
}