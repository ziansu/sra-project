public void launchSettingsActivity(android.view.MenuItem item) {
    android.content.Intent launchSettings = new android.content.Intent(this, com.dita.dev.memoapp.ui.activity.SettingsActivity.class);
    startActivity(launchSettings);
    drawer.closeDrawer(GravityCompat.START);
}