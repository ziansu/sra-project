public void refreshStaleCodePages() {
    refreshStaleCodePages(rgbaTexture, 0);
    refreshStaleCodePages(esTuTvTexture, 1);
    synchronized(tileUpdates) {
        tileUpdates.clear();
    }
}