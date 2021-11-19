private static boolean isPackageInstalled(io.xdevs23.theme.bluemerald.cm.Context context, java.lang.String package_name) {
    android.content.pm.PackageManager pm = context.getPackageManager();
    try {
        pm.getPackageInfo(package_name, PackageManager.GET_ACTIVITIES);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}