public void setLastACK(int lastACK) {
    synchronized(this.lastACK) {
        this.lastACK.set(lastACK);
        this.lastACK.notify();
    }
}