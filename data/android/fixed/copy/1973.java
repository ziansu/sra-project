@java.lang.Override
public void setTTYMode(int ttyMode, android.os.Message onComplete) {
    super.setTTYMode(ttyMode, onComplete);
    if ((mImsPhone) != null) {
        mImsPhone.setTTYMode(ttyMode, onComplete);
    }
}