public void onClick(android.content.DialogInterface dialog, int id) {
    saveStopwatchTime();
    updateGameInDatabase();
    startActivity(mHomeIntent);
}