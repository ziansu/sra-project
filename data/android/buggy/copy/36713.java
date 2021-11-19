static java.lang.String getCharset(org.eclipse.ui.IEditorPart editor) {
    org.eclipse.core.resources.IFile file = org.jtool.macrorecorder.internal.recorder.EditorUtilities.getInputFile(editor);
    try {
        return file.getCharset();
    } catch (org.eclipse.core.runtime.CoreException e) {
    }
    return null;
}