private android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
    return context == null ? null : context.getSharedPreferences(com.rey.material.app.ThemeManager.PREF, Context.MODE_PRIVATE);
}