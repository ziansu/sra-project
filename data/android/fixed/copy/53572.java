private double calculateOverallQualityMeasure(java.lang.Integer numsentence) {
    double qualityMeasure = java.lang.Math.abs((1 - (((numDefectiveSentences.doubleValue()) / (numsentence.doubleValue())) * 100)));
    return qualityMeasure;
}