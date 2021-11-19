private static int getThemNumber(android.app.Activity activity) {
    android.content.SharedPreferences sharedPreferences = activity.getPreferences(Context.MODE_PRIVATE);
    return sharedPreferences.getInt(com.supersnek.accounting.Utils.Utils.THEME_KEY, Context.MODE_PRIVATE);
}