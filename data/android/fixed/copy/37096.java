public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.Intent intent = new android.content.Intent(this, io.github.sdsstudios.ScoreKeeper.EditGame.class);
    intent.putExtra("gameID", gameID);
    startActivity(intent);
}