private synchronized void connectNotInUi() {
    rtmpConnection.setConnectListener(listener);
    rtmpConnection.connect(mRtmpUrl);
}