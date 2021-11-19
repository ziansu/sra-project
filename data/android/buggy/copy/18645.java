private void createHttpSender() {
    mSender = new com.ottochiu.mse.heartbeat_simulator.HeartbeatSimulatorActivity.HttpDataSender(new org.apache.http.impl.client.DefaultHttpClient(), new org.apache.http.client.methods.HttpPost(getString(R.string.url)));
}