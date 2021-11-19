public void stop() {
    sm.unregisterListener(this);
    clientHelper.disconnect();
}