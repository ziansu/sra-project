static boolean isPackageInstalled(java.lang.String packagename, android.content.pm.PackageManager packageManager) {
    try {
        packageManager.getPackageInfo(packagename, 0);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}