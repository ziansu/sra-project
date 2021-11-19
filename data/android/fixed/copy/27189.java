void completeInner() {
    currentSubscriber = null;
    if ((rx.internal.operators.OperatorConcat.ConcatSubscriber.WIP_UPDATER.decrementAndGet(this)) > 0) {
        subscribeNext();
    }
    rx.internal.operators.OperatorConcat.ConcatSubscriber.request(1);
}