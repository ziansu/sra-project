private void mapThresholds(java.lang.String which, java.lang.String threshold) {
    switch (which) {
        case "avsbc" :
            thresholds.put("AvsBC", threshold);
        default :
            thresholds.put("CvsAB", threshold);
    }
}