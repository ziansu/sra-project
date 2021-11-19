public void decreaseDistance(int decrement) {
    distance -= decrement;
    if ((distance) < 0) {
        distance = 0;
    }
}