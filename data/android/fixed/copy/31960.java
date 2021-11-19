@org.junit.Test
public void dequeueAllReturnsEmptyIfQueueIsEmpty() {
    java.util.List<util.object.Pair<java.util.Optional<java.lang.String>, java.lang.Integer>> actual = queue.dequeue();
    assertNotNull(actual);
    assertThat(actual.size(), is(0));
}