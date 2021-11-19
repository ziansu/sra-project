private void applicationStoppedUploading() {
    gui.startCompetitionUploadButton.setVisible(true);
    gui.stopCompetitionUploadButton.setVisible(false);
    stopUploadTimer();
}