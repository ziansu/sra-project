public void initializeDefaultPreferences() {
    org.eclipse.jface.preference.IPreferenceStore store = com.gregorbyte.designer.headless.HeadlessServerActivator.getDefault().getPreferenceStore();
    store.setDefault(PreferenceConstants.P_PORT, "8282");
    store.setDefault(PreferenceConstants.P_START, true);
}