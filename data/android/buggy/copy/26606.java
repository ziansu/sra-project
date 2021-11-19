public void detach() {
    cartView = null;
    if (((subscriptions) == null) || (subscriptions.isUnsubscribed())) {
        return ;
    }
    subscriptions.unsubscribe();
}