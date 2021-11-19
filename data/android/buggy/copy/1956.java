public boolean unMount() {
    fatHandler.stopCaching();
    return fatHandler.unMount();
}