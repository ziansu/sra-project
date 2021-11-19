public void printList() {
    while ((head) != null) {
        java.lang.System.out.print(head.data);
        head.next = $missing$;
    } 
    java.lang.System.out.println();
}