@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    setType(colIdx, ((org.cytoscape.tableimport.internal.util.SourceColumnSemantic) (evt.getNewValue())));
    updatePreviewTable(colIdx);
}