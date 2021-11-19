@java.lang.Override
public void done() {
    mSpinCounter.stop();
    mSpinnerView.reset();
    mSpinnerView.setRotation(0);
    mScoreManager.reportSpins(mUsername, mCurrentNumberOfSpins);
    mCurrentNumberOfSpins = 0;
}