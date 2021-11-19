public void connectSoft() throws de.mickare.xserver.exceptions.NotInitializedException, java.io.IOException, java.lang.InterruptedException {
    try (de.mickare.xserver.util.concurrent.CloseableLock c = conLock.writeLock().open()) {
        if (!(this.isConnected())) {
            this.connect();
        }
    }
}