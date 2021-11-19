@java.lang.Override
protected void doOnSubscribe(org.reactivestreams.Subscription subscription) {
    if (log.isInfoEnabled()) {
        log.info("onSubscribe({})", this.subscription);
    }
    super.doOnSubscribe(subscription);
}