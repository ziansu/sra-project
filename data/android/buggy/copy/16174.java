protected void onPermissionResult(ext.android.permissions.ExtPermission permission, java.lang.Integer permissionResult) {
    if ((permission.isMandatory()) && (permissionResult != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        requestPermissionHandler.onPermissionDenied();
    }
}