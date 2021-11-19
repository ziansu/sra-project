private void doBet(int amount) {
    this.player.reduceMoney(amount);
    this.table.placeBet(this.player, amount);
}