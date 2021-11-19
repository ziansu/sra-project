@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    try {
        crearRosco(true, panelLetrasJugador);
        crearRosco(true, panelLetrasContrincante);
        iv.setDisable(false);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}