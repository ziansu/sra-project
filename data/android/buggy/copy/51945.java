@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((android.content.pm.PackageManager.PERMISSION_GRANTED) != (android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE))) {
        refreshPhotoList();
    }
}