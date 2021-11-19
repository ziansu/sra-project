public void arcRight(float radius, float deg) {
    deg = deg * (-1);
    pilot.arc(radius, deg);
    while (pilot.isMoving()) {
    } 
}