public void saveCounter() {
    android.preference.PreferenceManager.getDefaultSharedPreferences(getContext()).edit().putInt("counter", tracker.getCount()).apply();
    android.util.Log.d("Sharedpref", "Saved to sharedpref");
}