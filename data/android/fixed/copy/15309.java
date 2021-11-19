public void movePlayerTop(javafx.event.ActionEvent actionEvent) {
    if (gameField.movePlayer(PlayerMoves.TOP)) {
        (correctorJCoordAfterMove)--;
        updateVisualField();
    }
}