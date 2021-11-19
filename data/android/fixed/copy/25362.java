@java.lang.Override
public void setMyLocationEnabled(boolean enabled) {
    if ((myLocationEnabled) != enabled) {
        if (com.airbnb.android.airmapview.RuntimePermissionUtils.checkLocationPermissions(getActivity(), this)) {
            myLocationEnabled = enabled;
        }
    }
}