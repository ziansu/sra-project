@java.lang.Override
public void run() {
    started = true;
    org.elasticsearch.common.util.concurrent.FutureUtils.cancel(timeoutFuture);
    runAndClean(runnable);
}