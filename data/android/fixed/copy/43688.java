private void hideFooterView() {
    if ((mFooterView) != null) {
        mFooterView.setPadding(0, 0, 0, (-(mFooterView.getHeight())));
        mIsPullUpLoading = false;
    }
}