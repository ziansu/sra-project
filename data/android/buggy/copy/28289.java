@java.lang.Override
public void error(final java.lang.Exception ex) {
    exceptionHolder.add(ex);
    latch.countDown();
}