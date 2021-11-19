private boolean isStoragePermissionGiven() {
    boolean tmp;
    tmp = (android.support.v4.content.ContextCompat.checkSelfPermission(this.getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED);
    return tmp;
}