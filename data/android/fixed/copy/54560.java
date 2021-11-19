public void run() {
    if (drinkIsFinished) {
        mProgressStatus = 0;
        showFillingProgress.dismiss();
        drinkIsFinished = false;
        return ;
    }
    mProgress.setProgress(mProgressStatus);
}