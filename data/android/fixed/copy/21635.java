public void setIntermediateScore(java.lang.Integer scoreId, java.lang.Double score) {
    zooActivateWrite();
    if ((intermediateScores) == null) {
        createIntermediateScoreMap();
    }
    intermediateScores.put(scoreId, score);
}