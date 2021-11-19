public void solicitarCorreccionTrayectoria(int robotID, int Dirección, java.awt.Point Posicion) {
    if (Posicion == null) {
        enviarSMS(Networking.base.GestionDeMensajes.SolicitarCorreccionTrayectoria(robotID, Dirección, Posicion));
    }
}