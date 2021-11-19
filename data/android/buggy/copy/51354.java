public void getSat() throws java.sql.SQLException {
    controller.SatelliteController controller = controller.SatelliteController.getInstance();
    this.satellite = controller.getSatellitesList();
}