public void onCtrlClick(java.lang.String url, boolean ctrlLcok, boolean stopOrAuto) {
    txtProgress.setVisibility(View.VISIBLE);
    progressBarCircle.setVisibility(View.VISIBLE);
    webCtrlView.loadUrl(url);
    this.ctrlLock = ctrlLcok;
    this.stopOrAuto = stopOrAuto;
}