public synchronized void createIntermediateScoreMap() {
    zooActivateWrite();
    setModified(true);
    if ((intermediateScores) == null) {
        intermediateScores = new java.util.HashMap<java.lang.Integer, java.lang.Double>();
    }
}