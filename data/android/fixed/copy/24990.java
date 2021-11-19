public void showProgress(@android.support.annotation.NonNull
java.lang.String progressMessage) {
    if (!(mInProgress)) {
        mStepperFeedbackType.showProgress(progressMessage);
        mInProgress = true;
    }
}