@org.junit.Test
public void dequeueAllReturnsEmptyIfQueueIsEmpty() {
    java.util.stream.Stream<util.object.Pair<java.util.Optional<java.lang.String>, java.lang.Integer>> actual = queue.dequeue();
    assertNotNull(actual);
    assertThat(actual.count(), is(0L));
}