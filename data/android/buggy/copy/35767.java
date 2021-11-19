public void arcRight(float radius, float deg) {
    deg = deg * (-1);
    pilot.arc(size, deg);
    while (pilot.isMoving()) {
    } 
}