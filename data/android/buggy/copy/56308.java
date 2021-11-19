private void leaveLobby() {
    android.util.Log.d(com.github.mrm1st3r.cards.lobby.LobbyActivity.TAG, "leaving lobby");
    conn.setOnConnectionChangeHandler(null);
    if ((conn) != null) {
        conn.close();
        conn = null;
    }
    playerList.clear();
}