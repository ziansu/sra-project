public void setPaintMode(boolean status) {
    if (status)
        mEraseMode = false;
    
    mPaintMode = status;
    if (!(mEraseMode))
        mOldStrokeSize = mStrokeSize;
    
}