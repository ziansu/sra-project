public WellKnownAPI.WellKnownConfig get() {
    java.lang.String wellKnownConfigJson = context.getSharedPreferences(com.telenor.connect.id.TokenStore.PREFERENCES_FILE, Context.MODE_PRIVATE).getString(com.telenor.connect.WellKnownConfigStore.PREFERENCE_KEY_WELL_KNOWN_CONFIG, null);
    return preferencesGson.fromJson(wellKnownConfigJson, WellKnownAPI.WellKnownConfig.class);
}