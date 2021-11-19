@java.lang.Override
public void onError(java.lang.Throwable e) {
    if (rx.internal.operators.OperatorMerge.InnerSubscriber.ONCE_TERMINATED.compareAndSet(this, 0, 1)) {
        parentSubscriber.innerError(e);
    }
}