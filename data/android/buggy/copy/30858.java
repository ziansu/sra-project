public void initializeDefaultPreferences() {
    org.eclipse.jface.preference.IPreferenceStore store = de.jcup.egradle.eclipse.Activator.getDefault().getPreferenceStore();
    store.setDefault(PreferenceConstants.P_BOOLEAN, true);
    store.setDefault(PreferenceConstants.P_CHOICE, "choice2");
    store.setDefault(PreferenceConstants.P_STRING, "Default value");
}