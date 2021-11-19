public void generateGrass() {
    java.util.Set<rpggame.IntegerPair> allTiles = this.getAllCoordsInZone();
    for (rpggame.IntegerPair tile : allTiles) {
        addNonSolidGrass(tile, "grass");
    }
}