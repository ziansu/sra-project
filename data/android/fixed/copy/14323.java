public void refreshStaleCodePages() {
    synchronized(tileUpdates) {
        refreshStaleCodePages(rgbaTexture, 0);
        refreshStaleCodePages(esTuTvTexture, 1);
        tileUpdates.clear();
    }
}