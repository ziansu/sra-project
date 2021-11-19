@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    java.lang.System.out.println("--- onConfigurationChanged");
    super.onConfigurationChanged(newConfig);
    drawerToggle.onConfigurationChanged(newConfig);
}