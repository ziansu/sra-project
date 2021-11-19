public static int i(java.lang.String tag, java.lang.String msg) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        return android.util.Log.i(tag, msg);
    }
    return 0;
}