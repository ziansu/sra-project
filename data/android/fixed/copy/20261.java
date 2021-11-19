public void createFieldEditors() {
    addField(new org.eclipse.jface.preference.DirectoryFieldEditor(PreferenceConstants.P_ROOTPROJECT_PATH.getId(), "&Gradle root project path:", getFieldEditorParent()));
    addField(new org.eclipse.jface.preference.DirectoryFieldEditor(PreferenceConstants.P_JAVA_HOME_PATH.getId(), "&JAVA HOME set for gradle:", getFieldEditorParent()));
}