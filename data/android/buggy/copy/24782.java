public static void cameraPermissions(android.app.Activity activity, int id, com.liangmayong.base.support.permission.ActivityPermission.OnPermissionListener listener) {
    java.lang.String[] permissionsNeeded = new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.WRITE_EXTERNAL_STORAGE , Manifest.permission.READ_EXTERNAL_STORAGE };
    com.liangmayong.base.support.permission.ActivityPermission.requestPermissions(activity, id, permissionsNeeded, listener);
}