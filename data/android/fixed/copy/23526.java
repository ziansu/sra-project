@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    sortElement(columnList, columnsElementViewer);
    computeRefreshDataPreviewPart(isLeftPart, columnList, columnsElementViewer);
}