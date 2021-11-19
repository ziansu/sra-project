public void close() {
    mLibFQRtmp.stop();
    mLibFQRtmp = null;
    mActivity.setContentView(R.layout.info);
    mActivity = null;
}