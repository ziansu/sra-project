boolean castDisconnect(boolean castDisconnect) {
    if (castDisconnect) {
        castManager.disconnect();
        return true;
    }
    return false;
}