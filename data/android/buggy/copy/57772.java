public synchronized java.util.List<bacter.ACGEventList.Event> getACGEvents() {
    updateEvents();
    return events;
}