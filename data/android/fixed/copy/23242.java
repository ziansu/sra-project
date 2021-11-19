long getMatchedMusicId() {
    return ((long) (de.robv.android.xposed.XposedHelpers.callMethod(musicInfo, "getMatchedMusicId")));
}