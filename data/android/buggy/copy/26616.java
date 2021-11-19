boolean isWater(int tile) {
    if ((tile > 1) && (tile < 21)) {
        java.lang.System.out.println("hit water");
        return true;
    }
    return false;
}