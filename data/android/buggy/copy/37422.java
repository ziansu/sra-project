private void removeObserverInternal() {
    (observerCount)--;
    if ((observerCount) == 0) {
        choreographer.removeFrameCallback(this);
        sampledVsyncTimeNs = 0;
    }
}