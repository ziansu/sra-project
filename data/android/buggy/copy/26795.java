public boolean removePlayer(java.lang.String name) {
    for (game.logic.Player p : players) {
        if (p.getUsername().equals(name)) {
            players.remove(p);
            return true;
        }
    }
    return false;
}