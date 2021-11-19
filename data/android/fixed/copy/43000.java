public void update(float deltaTime) {
    currTime += deltaTime;
    if ((target) == null) {
        target = findClosestEnemy();
    }
    if ((currTime) > (thinkingTime)) {
        makeNextDecision();
    }
}