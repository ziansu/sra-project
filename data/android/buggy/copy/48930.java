@org.junit.Test
public void testAddFirst() throws java.lang.Exception {
    deque.addFirst(1);
    deque.addFirst(2);
    java.lang.Integer first = deque.removeFirst();
    assertSame("should be same", 2, first);
}