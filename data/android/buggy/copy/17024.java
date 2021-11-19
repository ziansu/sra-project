@java.lang.Override
public void accept(java.lang.Void aVoid) {
    org.reactivestreams.Subscription s = subscription;
    subscription = null;
    if (s != null) {
        s.cancel();
    }
}