public void clearQueuedFrames() {
    for (figurabia.ui.video.engine.messages.CachedFrame cf : queuedFrames) {
        recycle(cf, 1);
    }
    queuedFrames.clear();
}