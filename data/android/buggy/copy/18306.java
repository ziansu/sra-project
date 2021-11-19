private boolean isNotificationsEnabled() {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean(getString(R.string.pref_chat_notifications_key), false);
}