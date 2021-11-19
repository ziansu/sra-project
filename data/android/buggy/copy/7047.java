@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ev) {
    try {
        javax.swing.text.JTextComponent editorTextComponent = org.netbeans.api.editor.EditorRegistry.lastFocusedComponent();
        if (editorTextComponent != null) {
            swingGetterAndSetterGenerator.generate(editorTextComponent);
        }
    } catch (java.lang.Exception ex) {
    }
}