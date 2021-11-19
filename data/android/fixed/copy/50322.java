public final void waitForVisionStart() throws java.lang.InterruptedException {
    while (!(this.isInitialized())) {
        synchronized(this) {
            this.wait();
        }
    } 
}