private void sendToAllSubscriptions() {
    for (com.github.kdvolder.minireactor.InfiniteCacheFlux<T>.MySubscription sub : subscriptions) {
        sub.satisfyDemand();
    }
}