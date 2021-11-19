@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    Reddit.seen.edit().putBoolean(SettingValues.PREF_FAB_CLEAR, true).apply();
    me.ccrama.redditslide.Reddit.fabClear = true;
    clearSeenPosts(true);
}