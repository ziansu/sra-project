@com.squareup.otto.Subscribe
public void onFetchStarted(com.valevich.balinasofttest.eventbus.events.FetchStartedEvent event) {
    notifyUser(mLoadingMessage, false);
}