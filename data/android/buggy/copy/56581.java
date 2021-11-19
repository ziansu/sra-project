private poker.Player getWinner() {
    if (checkGameOver()) {
        if ((joueur.getCoin()) <= 0) {
            return joueur;
        }
        return computer;
    }
    return null;
}