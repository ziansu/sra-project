public void saveCookie(java.lang.String cookieStr) {
    android.content.SharedPreferences.Editor edit = perf.edit();
    edit.putString(com.coder4.amvt.agent.UserAgent.STORE_KEY_COOKIE, cookieStr);
    edit.apply();
}