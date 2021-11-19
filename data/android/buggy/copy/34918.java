private void startGame(int i) {
    android.util.Log.d(aditi.hangman.MainActivity.TAG, ("clicked on " + i));
    android.content.Intent intent = new android.content.Intent(this, aditi.hangman.Game.class);
    intent.putExtra(Game.KEY_CATEGORY, i);
    startActivity(intent);
}