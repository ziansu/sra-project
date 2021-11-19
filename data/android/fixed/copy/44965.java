private static boolean verifyPermissions(int[] grantResults) {
    if ((grantResults.length) <= 0)
        return false;
    
    for (int grantResult : grantResults) {
        if (grantResult != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
            return false;
        }
    }
    return true;
}