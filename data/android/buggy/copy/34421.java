@permissions.dispatcher.OnShowRationale(value = { Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.ACCESS_FINE_LOCATION })
void showRationaleForLocation(final permissions.dispatcher.PermissionRequest request) {
    by.vshkl.translate2.util.DialogUtils.showLocationRationaleDialog(getApplicationContext(), request);
}