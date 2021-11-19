private void nextRound() {
    android.util.Log.d("aaa", "nextRound");
    for (ma.com.eclipsecalculator.model.Ship ship : attackers) {
        ship.nextRound();
    }
    for (ma.com.eclipsecalculator.model.Ship ship : defenders) {
        ship.nextRound();
    }
}