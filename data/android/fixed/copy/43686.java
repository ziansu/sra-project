private void addObserverInternal() {
    (observerCount)++;
    if (((observerCount) == 1) && ((choreographer) != null)) {
        choreographer.postFrameCallback(this);
    }
}