public void setOurTurn() {
    isOurTurn = true;
    javafx.application.Platform.runLater(() -> gridPane.setStyle(Game.Controllers.BoardController.ourTurnGridStyle));
}