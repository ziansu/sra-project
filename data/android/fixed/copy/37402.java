public void run() {
    com.philemonworks.selfdiagnose.DiagnosticTaskResult actualResult = task.run(ctx);
    if ((this.result) == null) {
        this.result = actualResult;
    }
    latch.countDown();
}