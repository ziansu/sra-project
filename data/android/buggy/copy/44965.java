private static boolean verifyPermissions(int[] grantResults) {
    for (int grantResult : grantResults) {
        if (grantResult != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            return false;
        }
    }
    return true;
}