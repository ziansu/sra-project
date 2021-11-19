@java.lang.Override
public void call(java.lang.String v) {
    org.junit.Assert.assertEquals("one", v);
    latch.countDown();
}