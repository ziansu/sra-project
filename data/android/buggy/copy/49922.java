public java.lang.String getAddPlayer() {
    playerNumber = playerSelectionPanel.getPlayerSize();
    addPlayerPanel = new View.AddPlayerPanel(currentPlayerNumber, playerNumber, this);
    super.add(addPlayerPanel, addPlayer);
    return addPlayer;
}