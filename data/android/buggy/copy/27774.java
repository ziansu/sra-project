@java.lang.Override
public void onConnectionFailure(int error, java.lang.String reason) {
    close(error, reason, Callback.NOOP);
    notifyFailure(this, new java.io.IOException(java.lang.String.format("%d/%s", error, reason)));
}