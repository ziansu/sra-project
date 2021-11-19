@java.lang.Override
protected void listenerAdded(net.dankito.sync.synchronization.SyncEntityChangeListener addedListener, java.util.List<net.dankito.sync.synchronization.SyncEntityChangeListener> allListeners) {
    if ((allListeners.size()) == 0) {
        registerContentObserver();
    }
    super.listenerAdded(addedListener, allListeners);
}