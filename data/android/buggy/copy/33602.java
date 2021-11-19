@java.lang.Override
public void send(final java.lang.String text) {
    if ((mServiceBinder) != null)
        mServiceBinder.send(text);
    
}