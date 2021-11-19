@java.lang.Override
public void run() {
    if (listener != null) {
        listener.onConnectionStatusChanged("Listening for incoming connections", tempPort);
    }
}