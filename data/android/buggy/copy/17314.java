public void onClick(android.content.DialogInterface dialog, int id) {
    saveStopwatchTime();
    mGame.setmCompleted(true);
    updateGameInDatabase();
    startActivity(mHomeIntent);
}