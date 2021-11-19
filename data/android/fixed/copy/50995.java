private boolean hasPermissions() {
    int permission = android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    return permission == (android.content.pm.PackageManager.PERMISSION_GRANTED);
}