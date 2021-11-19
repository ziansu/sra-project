public static Event PreambleStart(Node source, double time) {
    return new Event(source, time, EventType.PREAMBLE_START);
}