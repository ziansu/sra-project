public boolean usingDeepSearch() {
    return getSharedPreferences().getBoolean(tw.firemaples.quick_translator.util.SharePreferenceUtil.PREF_DEEP_SEARCH, false);
}