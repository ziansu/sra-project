private boolean hasSpotBeenHitBefore(int candHitPos) {
    java.lang.System.out.println(("Check for spot been hit before, candHitPos: " + candHitPos));
    return allOppMoves.containsKey(candHitPos);
}