@java.lang.Override
public int getStarsEarned() {
    return java.lang.Math.max(0, (3 - (numCoveredNumberSets())));
}