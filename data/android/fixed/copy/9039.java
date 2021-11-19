public void setFirstRunFalse() {
    sunday.app.bairead.tool.PreferenceSetting.sharedPreferences.edit().putBoolean(sunday.app.bairead.tool.PreferenceSetting.KEY_FIRST_RUN, false).commit();
}