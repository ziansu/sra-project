public void simulate() {
    while (!(eventQueue.empty())) {
        Event event = eventQueue.next();
        Event reaction = event.dest.react(event);
        generateRelativeEvents(reaction);
    } 
}