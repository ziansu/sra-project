@javafx.fxml.FXML
private void stopMusic(javafx.scene.input.MouseEvent event) {
    player.reset();
    pauseSymbol.setVisible(false);
    playSymbol.setVisible(true);
    songList.requestFocus();
}