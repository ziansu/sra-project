@java.lang.Override
public boolean onPrepareToPulse() {
    if (mLogoController.isEnabled()) {
        mLogoController.hideAndLock(mPulseOnListener);
        return true;
    }
    return false;
}