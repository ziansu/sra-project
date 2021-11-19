public void testTabbarActionsEnablement() {
    selectDiagram();
    checkEnabled(true);
    selectPackageElement();
    checkEnabledWithSelectedElement(true);
    lockDiagram();
    selectDiagram();
    checkEnabled(false);
    selectPackageElement();
    checkEnabledWithSelectedElement(false);
}