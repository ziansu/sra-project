@Test
public void clear() throws java.lang.Exception {
    queue.offer(1);
    queue.offer(2);
    queue.clear();
    assertSame(null, queue.poll());
}