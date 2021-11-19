public void addUser(java.lang.String gamename, User user) {
    Game game = gameList.get(gamename);
    game.AddUser(user);
    user.setGame(game);
    clientList.add(user);
}