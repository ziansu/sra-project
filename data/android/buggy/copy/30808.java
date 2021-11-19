@javafx.fxml.FXML
private void changeVolume(javafx.scene.input.MouseEvent event) {
    player.setVolume(songVolumeBar.getValue());
}