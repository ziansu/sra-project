@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    drawerToggle.onConfigurationChanged(newConfig);
    drawerToggle.setHomeAsUpIndicator(R.drawable.ic_drawer);
}