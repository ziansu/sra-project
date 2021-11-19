@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((dev.dworks.apps.anexplorer.setting.SettingsActivity.getActionBarColor(this)) != (actionBarColor)) {
        changeActionBarColor(0);
    }
}