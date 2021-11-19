private void clearFields() {
    mIsInterrupted = false;
    mModelCallback.clear();
    mCurrentScannedUrls = 0;
    mTotalWordsCount = 0;
    mFoundUrls.clear();
    mLinksQueue.clear();
}