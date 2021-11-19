private boolean isAutoLogin() {
    boolean is_auto_login = sharedPref.getBoolean(AppConstants.PREF_AUTOLOGIN, false);
    return is_auto_login;
}