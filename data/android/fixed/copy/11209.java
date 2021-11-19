private void sendState() {
    android.content.Intent intent = new android.content.Intent(PlayerActivity.FILTER);
    intent.putExtra(PlayerActivity.PARAM_STATE, state);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}