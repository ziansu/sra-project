public void showRouteCards(java.util.ArrayList<RouteCard> routeCards) {
    routePane = new RouteCardGlassPane();
    routePane.passCard(routeCards);
    this.setGlassPane(routePane);
    routePane.setVisible(true);
    routePane.repaint();
}