public void stopPlayer() {
    if ((player) == null)
        return ;
    
    if (player.isPlaying()) {
        player.stop();
    }
    stopped = true;
    player_status_broadcast();
}