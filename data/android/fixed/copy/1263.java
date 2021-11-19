private void createWarningErrorSection() {
    this.createSectionLabel("Errors and Warnings");
    final org.eclipse.swt.widgets.Composite composite = this.createHorizontalLayoutComposite();
    com.laboki.eclipse.plugin.smartsave.preferences.ui.PreferencesPage.createErrorComboView(composite, "Save files when &errors are present: ");
    com.laboki.eclipse.plugin.smartsave.preferences.ui.PreferencesPage.createWarningComboView(composite, "Save files when &warnings are present: ");
}