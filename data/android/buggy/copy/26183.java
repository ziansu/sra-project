private void sendToAllSubscriptions() {
    java.lang.System.out.println(">>>sendToAllSubscriptions");
    for (com.github.kdvolder.minireactor.InfiniteCacheFlux<T>.MySubscription sub : subscriptions) {
        sub.satisfyDemand();
    }
    java.lang.System.out.println("<<<sendToAllSubscriptions");
}