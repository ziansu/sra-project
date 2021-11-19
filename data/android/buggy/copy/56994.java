private void execute(int newBufferSize, java.util.concurrent.ExecutorService executor, java.util.concurrent.CountDownLatch latch) {
    for (int i = 0; i < newBufferSize; i++) {
        executor.execute(new com.navercorp.pinpoint.common.server.util.DisruptorExecutorTest.LatchAwaitRunnable(latch));
    }
}