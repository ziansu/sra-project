public synchronized void addAction(de.sebpas.replay.filesystem.FrameAction action) {
    this.changed = true;
    this.currentFrame.addAction(action);
}