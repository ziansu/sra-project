public void setCaptureTime(final float captureMillis) {
    this.captureMillis = captureMillis;
    if ((scopeDataListener) != null) {
        scopeDataListener.setCaptureTimeMillis(captureMillis);
    }
}