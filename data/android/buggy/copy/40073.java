private void showLoading(boolean loading) {
    loadingPanel.setVisible(loading);
    liveResourcesFP.setVisible((!loading));
    downloadBtn.setVisible((!loading));
}