public long getTimeSpent() {
    long time = sharedPreferences.getLong(context.getString(R.string.time), 0);
    android.util.Log.d("waleola", ("called SharedPreferenceManager.. time .... = " + time));
    return time;
}