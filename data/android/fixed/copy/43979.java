private boolean isAppConfigured() {
    return ((mGcmTokenPreference) != null) && (!(android.text.TextUtils.isEmpty(mGcmTokenPreference.get())));
}