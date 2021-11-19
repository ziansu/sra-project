public void setBet(int bet) {
    if (isBetWithinBudget(bet)) {
        setBudget(((this.budget) - bet));
        this.bet = bet;
    }
    this.bet = bet;
    setFinishedRound(true);
}