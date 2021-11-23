public void addAtBegin(int data) {
    linkedList.Node n = new linkedList.Node(data);
    n.next = head;
    head = n;
    (size)++;
}