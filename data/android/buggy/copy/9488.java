private boolean resetKeyEventEventFlag(final int flag) {
    org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage &= ~flag;
    return (org.deviceconnect.android.deviceplugin.sw.profile.SWKeyEventProfile.sFlagKeyEventEventManage) == 0;
}