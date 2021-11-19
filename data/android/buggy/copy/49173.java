public static boolean getBoolean(android.content.Context context, java.lang.String name) {
    android.content.SharedPreferences settings = context.getSharedPreferences(duxeye.com.entourage.Utility.Utility.ENTOURAGE_DATA, 0);
    return settings.getBoolean(name, false);
}