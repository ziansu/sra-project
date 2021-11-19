private java.lang.String getLastUpdatedDate() {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    return sharedPref.getString(Constants.KEY_LAST_UPDATED_DATE, "N/A");
}