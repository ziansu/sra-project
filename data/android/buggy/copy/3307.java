private void checkNavigationHelper() {
    if ((mNavigationHelper) == null) {
        mIsPaused = false;
        mNavigationHelper = new net.reichholf.dreamdroid.fragment.helper.NavigationHelper(this);
        onProfileChanged(net.reichholf.dreamdroid.DreamDroid.getCurrentProfile());
    }
}