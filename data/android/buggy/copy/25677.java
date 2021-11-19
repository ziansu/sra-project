public static controllers.MasterController getInstance() {
    if ((controllers.MasterController.instance) == null) {
        controllers.MasterController.instance = new controllers.MasterController();
        controllers.upstream gossipController = new controllers.GossipController();
        controllers.MasterController.pokemonController = new controllers.PokemonController();
        controllers.MasterController.randomController = new controllers.RandomController();
    }
    return controllers.MasterController.instance;
}