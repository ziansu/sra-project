private void acceptableCoordinates() {
    if (!(shipWasHit)) {
        acceptAllFreeCoordinates();
    }else {
        java.util.Collections.sort(destroyedX);
        java.util.Collections.sort(destroyedY);
        acceptOnlySurroundings();
    }
}