protected void handleNotifications(com.esbjon.mapobjects.PlanetMap.BorderType moveType) {
    this.handleEntityOverlaps();
    this.handleVicinityOverlaps(moveType);
}