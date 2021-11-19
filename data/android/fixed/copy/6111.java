public static void setJavaPointsToAnalysisMode() {
    org.eclipse.jface.preference.IPreferenceStore preferences = com.ensoftcorp.open.pointsto.Activator.getDefault().getPreferenceStore();
    preferences.setValue(com.ensoftcorp.open.pointsto.preferences.PointsToPreferences.POINTS_TO_ANALYSIS_MODE, com.ensoftcorp.open.pointsto.preferences.PointsToPreferences.JAVA_POINTS_TO_ANALYSIS_MODE);
    com.ensoftcorp.open.pointsto.preferences.PointsToPreferences.loadPreferences();
}