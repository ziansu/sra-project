@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp();
    com.google.common.util.concurrent.FuturesTest.aggregateFutureLogger.addHandler(aggregateFutureLogHandler);
}