@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    super.onCreate(savedInstanceState);
    setRecentBar(null, me.ccrama.redditslide.Visuals.Palette.getDefaultColor());
}