private void nextRound() {
    for (ma.com.eclipsecalculator.model.Ship ship : attackers) {
        ship.nextRound();
    }
    for (ma.com.eclipsecalculator.model.Ship ship : defenders) {
        ship.nextRound();
    }
}