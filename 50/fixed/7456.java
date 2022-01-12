public static void loadPreferences() {
    try {
        com.ensoftcorp.open.commons.Activator.getDefault().getPreferenceStore();
    } catch (java.lang.Exception e) {
        com.ensoftcorp.open.commons.log.Log.warning("Error accessing commons preferences, using defaults...", e);
    }
    com.ensoftcorp.open.commons.preferences.CommonsPreferences.initialized = true;
}