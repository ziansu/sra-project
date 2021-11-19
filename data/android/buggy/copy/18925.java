public int getMaxDistance() {
    if ((maxDistance) == 0) {
        return DEFAULT_MAX_DISTANCE;
    }
    if ((maxDistance) < 0) {
        return 1000000000;
    }
    return maxDistance;
}