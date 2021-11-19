private void addToSharedPreferences(java.lang.String location) {
    mEditor.putString(Constants.PREFERENCES_EVENT, location).apply();
}