@java.lang.Override
public void partOpened(org.eclipse.ui.IWorkbenchPart part) {
    if (part instanceof net.refractions.udig.document.ui.DocumentView) {
        handleWorkbenchSelection(selectionService.getSelection());
    }
}