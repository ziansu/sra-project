public void setPercent(float percent) {
    mFlag = com.tcl.gc.download.view.DownloadWaveView.Status.RUNNING;
    mPercent = percent;
    postInvalidate();
}