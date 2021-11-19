public static int v(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_VERBOSE) {
        return android.util.Log.v(tag, msg, tr);
    }
    return 0;
}