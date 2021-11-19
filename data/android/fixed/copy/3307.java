private boolean checkNavigationHelper() {
    if ((mNavigationHelper) == null) {
        mNavigationHelper = new net.reichholf.dreamdroid.fragment.helper.NavigationHelper(this);
        onProfileChanged(net.reichholf.dreamdroid.DreamDroid.getCurrentProfile());
        return true;
    }
    return false;
}