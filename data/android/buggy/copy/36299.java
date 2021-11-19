protected void onShowProgress(java.lang.Object tag) {
    if ((mMvpView) != null) {
        mMvpView.showProgress(tag);
    }
}