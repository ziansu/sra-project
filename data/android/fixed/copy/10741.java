public void process(float deltaTime) {
    processAllPending(this::processEvent);
    processSystem(deltaTime);
}