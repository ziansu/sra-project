@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    mDrawerToggle.onConfigurationChanged(newConfig);
    if ((newConfig.orientation) != (prevOrientation)) {
        prevOrientation = newConfig.orientation;
        rotated = true;
    }
}