@java.lang.Override
protected boolean checkForStatePropertyAndOtherStateActions(final org.sosy_lab.cpachecker.cpa.arg.ARGState pState) {
    if (!(singleCheck)) {
        visitedStates.add(pState);
    }else {
        return super.checkForStatePropertyAndOtherStateActions(pState);
    }
    return true;
}