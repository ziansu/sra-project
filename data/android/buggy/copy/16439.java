public static int w(java.lang.String tag, java.lang.String msg) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_WARN) {
        return android.util.Log.w(tag, msg);
    }
    return 0;
}