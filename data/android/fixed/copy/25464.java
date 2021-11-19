private boolean resetTouchEventFlag(final int flag) {
    org.deviceconnect.android.deviceplugin.sw.profile.SWTouchProfile.sFlagTouchEventManage &= ~flag;
    return (org.deviceconnect.android.deviceplugin.sw.profile.SWTouchProfile.sFlagTouchEventManage) != 0;
}