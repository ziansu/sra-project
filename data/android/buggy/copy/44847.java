public void refreshUserInterface() {
    hestia.UI.activities.home.DeviceListFragment fragment = ((hestia.UI.activities.home.DeviceListFragment) (fragmentManager.findFragmentByTag("DeviceListFragment")));
    fragment.populateUI();
}