@java.lang.Override
public void call(java.lang.String value) {
    org.junit.Assert.assertEquals("last", value);
    latch.countDown();
}