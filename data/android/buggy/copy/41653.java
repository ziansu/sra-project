public void Traversal() {
    if ((head) == null) {
        return ;
    }else {
        Node temp;
        temp = head;
        while ((temp.next) != null) {
            java.lang.System.out.println(temp.data);
            temp = temp.next;
        } 
    }
}