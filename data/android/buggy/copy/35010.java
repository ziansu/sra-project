public static void api(java.lang.String s) {
    if ((com.joe.zatuji.Constant.IS_DEBUG) || (com.joe.zatuji.helper.SettingHelper.isDebug())) {
        android.util.Log.d("api", s);
    }
}