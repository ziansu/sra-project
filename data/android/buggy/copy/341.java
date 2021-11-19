public boolean playerWin(fr.esiea.chhuondaniere.player.Player currentPlayer) {
    if ((currentPlayer.getwordlist().size()) >= 10) {
        this.end = true;
        return true;
    }else {
        return false;
    }
}