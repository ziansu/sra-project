public void setOpClientTurn() {
    model.resetPlayerRoll();
    view.topPaneGame.setId("topPaneGamePL2");
    view.turnPL1.setVisible(true);
    view.turnPL2.setVisible(false);
    view.b_würfeln.setDisable(true);
}