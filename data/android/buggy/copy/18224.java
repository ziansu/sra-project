@java.lang.Override
protected void tearDown() throws java.lang.Exception {
    broker.stop();
    broker.waitUntilStopped();
    super.tearDown();
}