@java.lang.Override
public T poll() {
    return forget(delegate.poll());
}