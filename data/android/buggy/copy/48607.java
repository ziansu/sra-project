private void startScan(android.view.View v) {
    btScan.setText(getString(R.string.stop));
    resultContainer.removeAllViewsInLayout();
    showStartNotification();
    presenter.startScan();
}