static long getMatchedMusicId(java.lang.Object musicInfo) {
    return ((long) (de.robv.android.xposed.XposedHelpers.callMethod(musicInfo, "getMatchedMusicId")));
}