public void setSpectating(com.thebubblenetwork.api.game.Player p, boolean spectating) {
    if (spectating)
        enableSpectate(p);
    else
        disableSpectate(p);
    
}