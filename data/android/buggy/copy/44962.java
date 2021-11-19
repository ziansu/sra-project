@Test
public void poll() throws java.lang.Exception {
    queue.offer(1);
    assertSame(1, queue.poll());
    assertSame(null, queue.poll());
    runThreads(new ConcurrentMostRecentlyInsertedQueueTest.TestExpressionPoll(), "poll");
}