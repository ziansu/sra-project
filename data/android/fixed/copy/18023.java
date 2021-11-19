@java.lang.Override
public void call(java.lang.String v) {
    assertEquals("one", v);
    latch.countDown();
}