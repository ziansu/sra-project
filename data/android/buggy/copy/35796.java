private int randomBetween(int min, int max) {
    return (net.laby.game.GameRegion.RANDOM.nextInt(((java.lang.Math.abs(max)) - (java.lang.Math.abs(min))))) + min;
}