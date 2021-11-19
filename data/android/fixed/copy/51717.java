private static void setState(android.content.SharedPreferences prefs, com.apptentive.android.sdk.RatingModule.RatingState state) {
    prefs.edit().putString(Constants.PREF_KEY_RATING_STATE, state.name()).commit();
}