@java.lang.Override
public void onPause() {
    if ((mLSMediaCapture) != null) {
        mLSMediaCapture.resumeVideoEncode();
    }
    super.onPause();
}