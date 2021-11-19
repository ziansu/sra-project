public static controllers.Result index() {
    if ((controllers.Application.game) == null)
        controllers.Application.game = new controllers.Game();
    
    return ok(index.render());
}