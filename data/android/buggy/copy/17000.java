public void setPlayerBet(double playerBet) {
    if (playerBet > (this.getBalance())) {
        playerBet = this.getBalance();
        this.playerBet = playerBet;
    }else {
        this.playerBet = playerBet;
    }
}