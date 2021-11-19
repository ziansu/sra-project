public static java.lang.String getStringPreference(java.lang.String key) {
    android.util.Log.d("WorkXpFragment", ("LANGUE - getStringPreference lang: " + (com.sinfreu.marie.resume.singletons.App.getPreferences().getString(key, ""))));
    return com.sinfreu.marie.resume.singletons.App.getPreferences().getString(key, "");
}