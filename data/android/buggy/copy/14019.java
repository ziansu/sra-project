protected void updateEditorColors(org.eclipse.ui.IEditorPart editor) {
    if (!(editor instanceof de.jcup.egradle.eclipse.ui.AbstractGroovyBasedEditor)) {
        return ;
    }
    de.jcup.egradle.eclipse.gradleeditor.GradleEditor geditor = ((de.jcup.egradle.eclipse.gradleeditor.GradleEditor) (editor));
    geditor.handleColorSettingsChanged();
}