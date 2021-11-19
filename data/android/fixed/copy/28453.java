private void setMenuAndStatusToGrammarOrRhythmCluster(java.lang.String tradeMode) {
    if (tradeMode.equals("Rhythm Helper")) {
        createRhythmClusterMenuAndStatus();
    }else {
        refreshSelectedGrammar("Grammar");
    }
}