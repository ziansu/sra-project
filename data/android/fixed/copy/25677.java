public static controllers.MasterController getInstance() {
    if ((controllers.MasterController.instance) == null) {
        controllers.MasterController.instance = new controllers.MasterController();
    }
    return controllers.MasterController.instance;
}