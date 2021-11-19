@org.junit.Test
public void testRemoveMiddleNodeWithEvenNodes() {
    ll.removeMiddleNode();
    org.junit.Assert.assertEquals("1 -> 2 -> 4 -> 5", ll.toString());
}