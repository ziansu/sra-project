private static com.apptentive.android.sdk.RatingModule.RatingState getState(android.content.SharedPreferences prefs) {
    return com.apptentive.android.sdk.RatingModule.RatingState.valueOf(prefs.getString(Constants.PREF_KEY_RATING_STATE, com.apptentive.android.sdk.RatingModule.RatingState.START.toString()));
}