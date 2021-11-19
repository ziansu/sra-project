public static void setupActionBar(android.content.Context context) {
    if (((Build.VERSION.SDK_INT) >= 11) && (de.nico.ha_manager.helper.Utils.isActionBarAvailable)) {
        de.nico.ha_manager.helper.ActionBarWrapper actionBarWrapper = new de.nico.ha_manager.helper.ActionBarWrapper(context, false);
        actionBarWrapper.setDisplayHomeAsUpEnabled(true);
    }
}