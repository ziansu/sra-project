private boolean enableModePlayOffline(android.content.Intent intent) {
    if (intent.hasExtra(Extras.KEY_MODE_OFFLINE)) {
        return true;
    }
    return false;
}