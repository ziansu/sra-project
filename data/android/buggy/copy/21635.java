public void setIntermediateScore(java.lang.Integer scoreId, java.lang.Double score) {
    zooActivateWrite();
    setModified(true);
    if ((intermediateScores) == null) {
        createIntermediateScoreMap();
    }
    intermediateScores.put(scoreId, score);
}