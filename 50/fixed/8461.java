public void removeCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    synchronized(this.dataLoaderCallbacks) {
        this.dataLoaderCallbacks.remove(callback);
    }
}