@java.lang.Override
public void onConnectionStatus(boolean isConnected) {
    if (!isConnected) {
        setDisconnected(true);
        setValue("disconnected");
    }else {
        setDisconnected(false);
    }
    setState();
}