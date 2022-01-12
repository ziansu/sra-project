@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    org.mm.cellfie.ui.view.TransformationExpressionEditorPanel editorPanel = new org.mm.cellfie.ui.view.TransformationExpressionEditorPanel();
    editorPanel.setSheetNames(container.getActiveWorkbook().getSheetNames());
    showMappingEditorDialog(editorPanel, (-1));
}