public static boolean isPackageInstalled(android.content.Context context, java.lang.String packageName) {
    try {
        context.getPackageManager().getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}