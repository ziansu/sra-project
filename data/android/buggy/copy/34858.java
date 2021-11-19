private void gacstr() throws org.chocosolver.solver.exception.ContradictionException {
    initializeData();
    maintainList();
    pruningPhase();
    if ((getCartesianProduct()) <= ((last.get()) + 1)) {
        setPassive();
    }
}