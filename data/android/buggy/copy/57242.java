public static boolean needPermission(android.app.Activity activity, java.lang.String[] permissions) {
    for (java.lang.String permission : permissions) {
        if (org.gem.indo.dooit.helpers.permissions.PermissionsHelper.needPermission(activity, permission)) {
            return false;
        }
    }
    return true;
}