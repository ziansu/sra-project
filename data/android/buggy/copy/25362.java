@java.lang.Override
public void setMyLocationEnabled(boolean enabled) {
    if ((myLocationEnabled) != enabled) {
        myLocationEnabled = enabled;
        com.airbnb.android.airmapview.RuntimePermissionUtils.checkLocationPermissions(getActivity(), this);
    }
}