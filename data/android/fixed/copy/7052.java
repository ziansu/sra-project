@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if (!(newConfig.locale.equals(mLastLocale))) {
        updateQsTile();
    }
}