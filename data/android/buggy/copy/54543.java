@java.lang.Override
public void dispose() {
    mBandPassFilter.dispose();
    mBandPassFilter = null;
    mDCFilter.dispose();
    mDCFilter = null;
}