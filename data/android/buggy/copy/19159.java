public com.wasteofplastic.beaconz.Scorecard getSC(double x, double z) {
    com.wasteofplastic.beaconz.Scorecard sc = null;
    com.wasteofplastic.beaconz.Game game = getGame(x, z);
    if (game != null)
        sc = game.getScorecard();
    
    return sc;
}