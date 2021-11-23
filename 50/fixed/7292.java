public static void ifmt(java.lang.String tag, java.lang.String fmt, java.lang.Object... args) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        java.lang.String msg = java.lang.String.format(java.util.Locale.US, fmt, args);
        android.util.Log.i(tag, msg);
    }
}