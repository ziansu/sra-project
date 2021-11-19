public void clearQueuedFrames() {
    for (figurabia.ui.video.engine.messages.CachedFrame cf : queuedFrames) {
        cf.recycle();
    }
    queuedFrames.clear();
}