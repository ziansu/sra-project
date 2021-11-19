public void run() {
    if (drinkIsFinished) {
        mProgressStatus = 100;
        showFillingProgress.dismiss();
        drinkIsFinished = false;
        return ;
    }
    mProgress.setProgress(mProgressStatus);
}