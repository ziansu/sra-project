public void arcLeft(float radius, float deg) {
    pilot.arc(size, deg);
    while (pilot.isMoving()) {
    } 
}