@java.lang.Override
public void afterCreatePartControl(org.eclipse.xtext.ui.editor.XtextEditor editor) {
    super.afterCreatePartControl(editor);
    try {
        createEditorOpenIndicatorFile(editor);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}