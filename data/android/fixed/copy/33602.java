@java.lang.Override
public void send(final java.lang.String text) {
    if ((this.mServiceBinder) != null) {
        this.mServiceBinder.send(text);
    }
}