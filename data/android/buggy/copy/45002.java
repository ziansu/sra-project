static org.eclipse.ui.IEditorPart getActiveEditor() {
    org.eclipse.ui.IWorkbenchWindow window = org.jtool.macrorecorder.internal.recorder.EditorUtilities.getActiveWorkbenchWindow();
    if (window != null) {
        org.eclipse.ui.IEditorPart part = window.getActivePage().getActiveEditor();
        return part;
    }
    return null;
}