private void onGameEnd(int Score, int difficulty) {
    android.content.Intent endGame = new android.content.Intent(this, com.twotowerstudios.clickr.PostGameScreen.class);
    endGame.putExtra("score", score);
    endGame.putExtra("difficulty", difficulty);
    startActivity(endGame);
}