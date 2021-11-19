public void setRatio(float ratio) {
    mRatio = ratio;
    if ((mRatio) < 10.0F)
        mRatio = 10.0F;
    
    android.util.Log.i(com.fourtech.variometer.AltimeterView.TAG, ("setRatio() ratio=" + ratio));
}