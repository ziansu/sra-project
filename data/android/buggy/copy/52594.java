public synchronized void addAction(de.sebpas.replay.filesystem.FrameAction action) {
    this.changed = true;
    synchronized(this) {
        this.currentFrame.addAction(action);
    }
}