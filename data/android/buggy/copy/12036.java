public boolean containsListener(rinde.sim.event.Listener l, java.lang.Enum<?> eventType) {
    return listeners.containsEntry(l, eventType);
}