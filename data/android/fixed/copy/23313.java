public void handle(javafx.event.ActionEvent arg0) {
    model.resetPlayerRoll();
    view.b_fertigGame.setDisable(true);
    server.sendObject(new message.ClientTurn(false));
}