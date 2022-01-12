public void endSession(android.view.View view) {
    if ((mMetricsManager) != null) {
        mMetricsManager.printMetrics();
    }
    this.finish();
}