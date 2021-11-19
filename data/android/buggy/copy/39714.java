@lists.linkedlist.tests.Test
void getObject() {
    lists.linkedlist.ListNode<java.lang.String> listNode = new lists.linkedlist.ListNode<java.lang.String>("Blabla");
    assertEquals("Blabla", listNode.getObject());
}