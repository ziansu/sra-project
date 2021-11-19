@java.lang.Override
protected void onStop() {
    super.onStop();
    android.provider.Settings.System.putInt(getContentResolver(), "show_touches", 0);
}