public static void game(java.lang.Integer gameId) {
    models.Game game = models.Game.get(gameId);
    notFoundIfNull(game);
    render(game);
}