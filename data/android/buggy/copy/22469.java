public static void d(java.lang.String tag, java.lang.String msg) {
    if (android.text.TextUtils.isEmpty(msg)) {
        return ;
    }
    if (com.vinci.imageloader.core.util.MLog.DEBUG) {
        android.util.Log.d(tag, msg);
    }
}