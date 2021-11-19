public void setInput(edu.rice.cs.hpc.viewer.window.Database db, edu.rice.cs.hpc.viewer.scope.RootScope scope, boolean keepColumnStatus) {
    database = db;
    myRootScope = scope;
    objViewActions.setTreeViewer(treeViewer);
    initTableColumns(keepColumnStatus);
    updateDisplay();
}