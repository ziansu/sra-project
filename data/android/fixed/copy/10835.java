public void addLast(T t) {
    com.shadowxz.LinkedList.Node<T> newNode = new com.shadowxz.LinkedList.Node<T>(t, last, null);
    last.next = newNode;
    last = newNode;
}