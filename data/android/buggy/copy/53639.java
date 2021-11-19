@java.lang.SuppressWarnings(value = "unused")
public void expand(java.lang.String url) {
    android.util.Log.d("TEST", "expand with url");
    loadUrl(url);
    if ((mState) == (de.madvertise.android.sdk.MadvertiseMraidView.STATE_HIDDEN)) {
        expand();
    }
}