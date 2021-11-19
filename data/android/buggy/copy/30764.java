@java.lang.Override
public void enqueue(java.lang.String word) {
    com.company.SNode newNode = new com.company.SNode(word);
    if (isEmpty()) {
        first = newNode;
    }else
        last.next = newNode;
    
    last = newNode;
}