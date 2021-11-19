private void showProgress(boolean showProgress) {
    mLoadingView.setVisibility((showProgress ? VISIBLE : GONE));
    mControllerView.setVisibility((showProgress ? GONE : VISIBLE));
}