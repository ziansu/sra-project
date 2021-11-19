@java.lang.Override
public void onPeerInvitedToRoom(com.google.android.gms.games.multiplayer.realtime.Room room, java.util.List<java.lang.String> arg1) {
    android.util.Log.e("#####", "F: onPeerInvitedToRoom");
    updateRoom(room);
}