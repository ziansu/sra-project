public static java.lang.String getTable(AfterLuntilR scope, Pattern pattern) {
    Proposition propositionR = scope.getPropositionR();
    return AfterLUntilRTable.getFormula(pattern, propositionR);
}