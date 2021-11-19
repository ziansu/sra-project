@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if ((checkPermissions()) == true) {
        initiateApp();
    }
}