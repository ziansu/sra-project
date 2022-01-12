public void addRunOnCloseCallback(final java.lang.Runnable runnable) {
    if ((_closeCallbacks) == null) {
        _closeCallbacks = new java.util.ArrayList<java.lang.Runnable>();
    }
    _closeCallbacks.add(runnable);
}