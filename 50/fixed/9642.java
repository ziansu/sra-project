public static boolean getAllowAdvancedData(android.content.Context context) {
    return (context != null) && (com.paulvarry.intra42.Tools.AppSettings.Advanced.getAllowAdvancedData(com.paulvarry.intra42.Tools.AppSettings.getSharedPreferences(context)));
}