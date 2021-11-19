@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    moveElement(columnList, columnsElementViewer, true);
    computeRefreshDataPreviewPart(isLeftPart, columnList);
}