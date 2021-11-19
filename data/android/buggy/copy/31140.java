@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        mNavigationHandler.switchFragment(new org.hisp.dhis2.android.sdk.fragments.SettingsFragment(), SettingsFragment.TAG);
    }
    return super.onOptionsItemSelected(item);
}