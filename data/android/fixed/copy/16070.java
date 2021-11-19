private void payoutIfNotPlayer(de.htwg.blackjack.controller.impl.IPlayer player) {
    if (player != (this.player)) {
        payoutWinner(this.player);
    }
}