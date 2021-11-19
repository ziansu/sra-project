public static void w(java.lang.String tag, java.lang.String msg) {
    daylemk.xposed.xbridge.utils.Log.xposedLog(tag, msg);
    android.util.Log.w(daylemk.xposed.xbridge.utils.Log.getFormattedTag(tag), msg);
}