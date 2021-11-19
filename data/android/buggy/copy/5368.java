@java.lang.Override
protected void onStop() {
    if ((mSensorManager) != null)
        mSensorManager.unregisterListener(mListener);
    
    super.onStop();
}