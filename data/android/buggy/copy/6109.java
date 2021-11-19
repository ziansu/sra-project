@lists.linkedlist.tests.Test
void setObject() {
    lists.linkedlist.ListNode<java.lang.String> listNode = new lists.linkedlist.ListNode<java.lang.String>("Blabla");
    listNode.setObject("lorem ipsum");
    assertEquals("lorem ipsum", listNode.getObject());
}