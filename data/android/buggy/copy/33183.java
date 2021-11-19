private boolean isTablet() {
    boolean isLarge = getResources().getBoolean(R.bool.isTablet);
    android.util.Log.d(com.example.android.musicstreamer.MainActivity.LOG_TAG, ("isLarge: " + isLarge));
    return isLarge;
}