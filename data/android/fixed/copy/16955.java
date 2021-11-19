@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    try {
        crearRosco(true, panelLetrasJugador);
        crearRosco(false, panelLetrasContrincante);
        iv.setDisable(false);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}