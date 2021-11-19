public void closedSocket() {
    this.aliveSender.setDone();
    this.send(createWinMessage((firstPlayer ? de.htwg.battleship.util.State.WIN1 : de.htwg.battleship.util.State.WIN2)));
}