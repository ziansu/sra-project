private double getMergeGQ(java.lang.Double oldGrpQuality, double confidence) {
    if (oldGrpQuality == 0.0) {
        return confidence;
    }
    return confidence > oldGrpQuality ? oldGrpQuality : confidence;
}