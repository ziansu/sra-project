void checkPermission() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
    }else {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, 1);
    }
}