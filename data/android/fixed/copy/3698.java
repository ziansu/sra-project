public static boolean checkNeed(android.content.Context context) {
    return !(jp.hazuki.yuzubrowser.utils.PermissionUtils.getPref(context).getBoolean(jp.hazuki.yuzubrowser.utils.PermissionUtils.NO_NEED, false));
}