@java.lang.Override
public T poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException {
    return delegate.poll(timeout, unit);
}