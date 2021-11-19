public boolean checkLocationRange(android.location.Location locA, android.location.Location locB, float accuracy) {
    float distance = locA.distanceTo(locB);
    if (distance < ((distanceRange) + accuracy)) {
        return true;
    }else {
        return false;
    }
}