public void setGlobalTransparency(float value) {
    android.content.SharedPreferences preferences = AppGlobal.shared_preferences;
    preferences.edit().putString("Global_Transparency", java.lang.String.valueOf(value)).commit();
}