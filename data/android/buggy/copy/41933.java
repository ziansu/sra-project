public java.lang.String toString(int maxTriedPredictions) {
    return java.lang.String.format(java.util.Locale.ENGLISH, "%f,%f,%f", threshold, predictionRate(), accuracy());
}