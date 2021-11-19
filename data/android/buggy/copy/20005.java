private int requestFailure(java.util.concurrent.atomic.AtomicInteger executionCounter) throws java.lang.InterruptedException {
    java.lang.System.out.println("failure");
    executionCounter.incrementAndGet();
    java.lang.Thread.sleep(eu.unicate.retroauth.LockingStrategyTests.FAILING_REQUEST_TIME);
    throw new eu.unicate.retroauth.exceptions.AuthenticationCanceledException(new android.accounts.OperationCanceledException());
}