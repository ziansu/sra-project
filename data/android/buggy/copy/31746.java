public void invitePlayers() {
    android.content.Intent intent = Games.RealTimeMultiplayer.getSelectOpponentsIntent(googleApiClient, com.example.umyhpuscdi.snapthat.MainActivity.MIN_PLAYERS, ((com.example.umyhpuscdi.snapthat.MainActivity.MAX_PLAYERS) - 1));
    startActivityForResult(intent, com.example.umyhpuscdi.snapthat.MainActivity.RC_SELECT_PLAYERS);
}