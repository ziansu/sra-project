public void detach() {
    cartView = null;
    if ((subscriptions) == null) {
        return ;
    }
    subscriptions.unsubscribe();
    subscriptions = null;
}