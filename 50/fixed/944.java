@java.lang.Override
public void loadUrl(java.lang.String url, boolean clearNavigationStack) {
    if (!(activityDelegate.isXWalkReady())) {
        startUrl = url;
        return ;
    }
    load(url);
}