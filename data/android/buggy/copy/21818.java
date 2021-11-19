private void saveToken(final java.lang.String token) {
    s.pahlplatz.fhict_companion.utils.PreferenceHelper.save(getBaseContext(), PreferenceHelper.TOKEN, token);
    startMainActivity();
}