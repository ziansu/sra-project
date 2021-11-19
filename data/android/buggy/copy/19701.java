public void setPaintMode(boolean status) {
    if (status)
        mEraseMode = false;
    
    mPaintMode = status;
    mOldStrokeSize = mStrokeSize;
}