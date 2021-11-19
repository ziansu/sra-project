public boolean containsListener(rinde.sim.event.Listener listener, java.lang.Enum<?> eventType) {
    return listeners.containsEntry(eventType, listener);
}