public void addErrorListener(com.podio.sdk.Request.ErrorListener listener, boolean deliverErrorNow, java.lang.Throwable error) {
    if (listener != null) {
        if (deliverErrorNow) {
            listener.onErrorOccured(error);
        }else {
            errorListeners.add(listener);
        }
    }
}