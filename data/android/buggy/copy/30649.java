public Event getNextEvent() {
    return events.get(((currentEventIndex)++));
}