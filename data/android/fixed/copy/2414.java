public void onShowError(java.lang.Object tag, java.lang.String message) {
    if ((mMvpView) != null) {
        mMvpView.hideProgress(null);
        mMvpView.showError(tag, message);
    }
}