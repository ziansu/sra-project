@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    callback.getVisualizationState().updateTableRowFilter(null, true);
    callback.updateVisualizationJustTables();
    callback.resetPickedStateAndUpdateView();
}