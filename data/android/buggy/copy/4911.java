public static java.lang.String getTable(BetweenLandR scope, Pattern pattern) {
    Proposition propositionL = scope.getPropositionL();
    Proposition propositionR = scope.getPropositionR();
    return BetweenLandRTable.getFormula(propositionL, propositionR, pattern);
}