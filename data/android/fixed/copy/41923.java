public void append(int new_data) {
    LinkedList.Node temp = head;
    LinkedList.Node new_node = new LinkedList.Node(new_data);
    while ((temp.next) != null) {
        temp = temp.next;
    } 
    temp.next = new_node;
    (length)++;
}