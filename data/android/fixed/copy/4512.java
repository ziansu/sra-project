private boolean enableModePlayOffline(android.content.Intent intent) {
    return intent.hasExtra(Extras.KEY_MODE_OFFLINE);
}