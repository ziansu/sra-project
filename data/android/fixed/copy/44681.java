public long getTimeSpent() {
    return sharedPreferences.getLong(context.getString(R.string.time), 0);
}