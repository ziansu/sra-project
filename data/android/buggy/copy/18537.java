public void twin() {
    SListNode currentnode = head;
    while (currentnode != null) {
        SListNode copynode = currentnode;
        currentnode.next = copynode;
        currentnode = copynode.next;
    } 
    java.lang.System.out.println(("after twin:" + (toString())));
}