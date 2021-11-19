public static void setLastExportTime(java.sql.Timestamp lastExportTime) {
    final java.lang.String utcString = org.gnucash.android.util.TimestampHelper.getUtcStringFromTimestamp(lastExportTime);
    android.util.Log.v(org.gnucash.android.util.PreferencesHelper.LOG_TAG, "Saving last export time for the currently active book");
    org.gnucash.android.util.PreferencesHelper.setLastExportTime(lastExportTime, org.gnucash.android.db.adapter.BooksDbAdapter.getInstance().getActiveBookUID());
}