public void addPlayer(game.model.Player p) {
    players.add(p);
    p.setRoom(rooms.get(0));
}