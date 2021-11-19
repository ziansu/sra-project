private void setMenuAndStatusToGrammarOrRhythmCluster(java.lang.String tradeMode) {
    if (tradeMode.equals("Rhythm Helper")) {
        createRhythmClusterMenuAndStatus();
    }else {
        notate.populateNotateGrammarMenu();
        notate.populateGenericGrammarMenu(tradeGrammarMenu);
        refreshSelectedGrammar("Grammar");
    }
}