@java.lang.Override
public void onPermissionsDenied(int requestCode, java.util.List<java.lang.String> perms) {
    if (pub.devrel.easypermissions.EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
        new pub.devrel.easypermissions.AppSettingsDialog.Builder(this).build().show();
    }
}