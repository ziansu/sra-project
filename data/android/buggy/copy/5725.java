public controllers.OneCreditController.OneCreditGame addGame(models.Game game) {
    controllers.OneCreditController.OneCreditGame oneCreditGame = new controllers.OneCreditController.OneCreditGame(game);
    this.games.add(oneCreditGame);
    return oneCreditGame;
}