public void notifyDataSetChanged() {
    currentCity = "";
    mAdapter.notifyDataSetChanged();
    if ((mDownBtn) != null) {
        mDownBtn.setText((mBinder.isDownloading() ? R.string.action_download_pause : R.string.action_download_start));
    }
}