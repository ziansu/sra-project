@java.lang.Override
public void run() {
    if ((mResultListener) != null) {
        mResultListener.onGenerateResult(mHowMany, mTotalGenerated, forcedStop);
    }
    mService.onGeneratingFinished(forcedStop);
}