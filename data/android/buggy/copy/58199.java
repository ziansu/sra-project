public tilitoli.GameList GetServerReplys() {
    synchronized(availableGames) {
        return availableGames;
    }
}