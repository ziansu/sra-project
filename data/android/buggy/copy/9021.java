public void testTabbarActionsEnablementForDiagram() {
    selectDiagram();
    checkEnabled(true);
    lockDiagram();
    checkEnabled(false);
}