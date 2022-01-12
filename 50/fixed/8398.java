public void addCallback(com.gvls2downloader.gvls2proxy.IDataLoaderCallback callback) {
    synchronized(this.dataLoaderCallbacks) {
        this.dataLoaderCallbacks.add(callback);
    }
}