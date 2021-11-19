public void run() {
    slash.navigation.converter.gui.RouteConverter r = slash.navigation.converter.gui.RouteConverter.getInstance();
    r.selectInsignificantPositions(100);
    r.getContext().getActionManager().run("delete");
    r.setRouteCharacteristics(slash.navigation.base.RouteCharacteristics.Route);
}