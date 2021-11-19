private void onStartTimeSet(int hourOfDay, int minute) {
    if (de.thm.ap.openfit.BuildConfig.DEBUG)
        android.util.Log.d(de.thm.ap.openfit.view.MotionFormActivity.LOG_TAG, ((hourOfDay + ":") + minute));
    
    mStart.setText(((hourOfDay + ':') + minute));
}