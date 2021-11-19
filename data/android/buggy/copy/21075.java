public float computeDistanceFrom(android.location.Location other) {
    return ((float) ((other.distanceTo(mLocation)) / 1000.0));
}