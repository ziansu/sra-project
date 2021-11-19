public boolean checkLocationRange(android.location.Location locA, android.location.Location locB) {
    float distance = locA.distanceTo(locB);
    if (distance < (distanceRange)) {
        return true;
    }else {
        return false;
    }
}