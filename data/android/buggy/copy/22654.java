@java.lang.Override
public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
    threadExecutor.clearThreads();
    initializeThreadExecutor();
    fetchAllChildren(schemaTree.getItems());
    updateItems(schemaTree.getItems(), false, false);
}