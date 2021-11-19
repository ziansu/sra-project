public void addAnswer(Server.ClientThread thread, java.lang.String answer) throws java.lang.Exception {
    User user = thread.user;
    Game game = user.getGame();
    game.addAnswer(user, answer);
    sendStatus(thread, Tuple.ANSWER, "Answer recieved.");
}