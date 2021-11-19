public void addPlayer(javafx.scene.Node player) {
    if (!(playersPane.getChildren().contains(player))) {
        playersPane.getChildren().add(player);
    }
}