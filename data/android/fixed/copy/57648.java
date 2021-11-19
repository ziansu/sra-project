public double getPassagesScore(java.util.List<java.lang.Double> passagesScore) {
    double denominatorScore = 0;
    for (java.lang.Double score : passagesScore) {
        denominatorScore += score;
    }
    return java.lang.Math.abs(denominatorScore);
}