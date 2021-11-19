@java.lang.Override
public void failed(java.lang.Throwable throwable, java.lang.Object o) {
    if (!(throwable instanceof java.nio.channels.AsynchronousCloseException)) {
        net.bourgau.philippe.concurrency.kata.Errors.errors().log(throwable);
    }
}