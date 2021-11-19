private void applicationStartedUploading() {
    gui.startCompetitionUploadButton.setVisible(false);
    gui.stopCompetitionUploadButton.setVisible(true);
    startUploadTimer();
}