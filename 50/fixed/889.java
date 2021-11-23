public static void setupCommandManager() {
    edu.iis.powp.appext.FeaturesManager.commandManager = new edu.iis.powp.command.manager.PlotterCommandManager();
    edu.iis.powp.command.manager.LoggerCommandChangeObserver loggerObserver = new edu.iis.powp.command.manager.LoggerCommandChangeObserver();
    edu.iis.powp.appext.FeaturesManager.commandManager.getChangePublisher().addSubscriber(loggerObserver);
}