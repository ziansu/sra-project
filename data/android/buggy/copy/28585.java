@java.lang.Override
public void onError(java.lang.String s) {
    listener.onError(s);
    mIsConnected = false;
}