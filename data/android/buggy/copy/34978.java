public void postStickyRemote(java.lang.Object event) {
    sendEventOverGooglePlayServices(event, true);
    postSticky(event);
}