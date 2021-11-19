@java.lang.Override
public void onError(java.lang.Throwable t) {
    io.grpc.Status status = io.grpc.Status.fromThrowable(t);
    com.google.cloud.speech.grpc.demos.RecognizeClient.logger.log(java.util.logging.Level.WARNING, "recognize failed: {0}", status);
    finishLatch.countDown();
}