@java.lang.Override
public void onUnsubscribeError(ws.wamp.jawampa.messages.ErrorMessage msg) {
    nonNull(subscriber).onUnsubscribed(msg);
}