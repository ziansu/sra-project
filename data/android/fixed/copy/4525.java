topl.Checker.State popEvent() {
    return new topl.Checker.State(vertex, store, events.pop(), parent, time, id);
}