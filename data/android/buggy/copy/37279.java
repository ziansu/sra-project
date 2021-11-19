@com.squareup.otto.Subscribe
public void onError(com.valevich.balinasofttest.eventbus.events.ErrorEvent event) {
    stopRefreshing();
    notifyUser(event.getMessage());
}