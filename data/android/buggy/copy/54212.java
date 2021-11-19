public static void forceRestart(android.content.Context c, boolean forceLoadScreen) {
    me.ccrama.redditslide.Reddit.appRestart.edit().putString("startScreen", "").apply();
    me.ccrama.redditslide.Reddit.forceRestart(c);
}