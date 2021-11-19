public void resume() {
    if ((player) == null) {
        return ;
    }
    player.resume();
    broadcast(Player.RESUMED_TRACK);
    pushSystemNotification();
}