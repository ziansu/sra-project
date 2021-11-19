@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    synchronized(renderSynch) {
        keepRunning = false;
        renderSynch.notify();
    }
}