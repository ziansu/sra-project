@java.lang.SuppressWarnings(value = { "unchecked" })
protected final void triggerNotifyComplete(P payload, S lastState, java.lang.Throwable error) {
    for (xephyrus.sam.core.CompletionListener listener : _completionListeners) {
        listener.notifyComplete(payload, lastState, error);
    }
}