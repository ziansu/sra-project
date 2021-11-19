public void update(float deltaTime) {
    currTime += deltaTime;
    if ((target) == null) {
        target = findClosestEnemy();
        java.lang.System.out.println("oabstract ai");
    }
    if ((currTime) > (thinkingTime)) {
        makeNextDecision();
    }
}