@java.lang.Override
protected void onPause() {
    if (logging)
        android.util.Log.d("MainActivity", "Start: onPause()");
    
    super.onPause();
    mStopButton.setEnabled(true);
    this.onClick(mStopButton);
}