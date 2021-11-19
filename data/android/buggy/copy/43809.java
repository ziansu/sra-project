public void onTick(long millisUntilFinished) {
    selectTiles();
    selectTiles();
    java.lang.String timeStr = "";
    t.setText(timeStr.format("%d", (millisUntilFinished / 1000)));
    selectTiles();
    selectTiles();
}