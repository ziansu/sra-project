private boolean isThresholdExceeded(java.util.Map<java.lang.Integer, java.lang.Double> ordered, double thresholdCounter) {
    boolean thresholdPassed = true;
    for (double score : ordered.values()) {
        if (score < thresholdCounter)
            thresholdPassed = false;
        
    }
    return thresholdPassed;
}