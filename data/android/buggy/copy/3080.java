private void lockControls() {
    filesList.setDisable(true);
    imageBox.setDisable(true);
    videoBox.setDisable(true);
    generateButton.setText("Cancel");
    locked = true;
}