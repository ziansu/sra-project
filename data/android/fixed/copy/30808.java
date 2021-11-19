@javafx.fxml.FXML
private void changeVolume(javafx.scene.input.MouseEvent event) {
    if ((player) != null)
        player.setVolume(songVolumeBar.getValue());
    
}