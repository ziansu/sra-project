public void run() {
    slash.navigation.converter.gui.RouteConverter r = slash.navigation.converter.gui.RouteConverter.getInstance();
    r.setRouteCharacteristics(slash.navigation.base.RouteCharacteristics.Track);
    r.getContext().getActionManager().run("select-all");
    r.getInsertPositionFacade().insertAllWaypoints();
}