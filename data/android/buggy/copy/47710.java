@java.lang.Override
public void close() {
    org.jw.basex.async.XqPromise.executor.shutdown();
    try {
        org.jw.basex.async.XqPromise.executor.awaitTermination(1, java.util.concurrent.TimeUnit.SECONDS);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    org.jw.basex.async.XqPromise.pool.shutdown();
}