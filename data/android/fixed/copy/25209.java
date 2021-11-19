private static void apostar() {
    pokernetwork.Servidor.juego.getFase().apostar(pokernetwork.Servidor.juego);
    if (pokernetwork.Servidor.juego.terminarTurno()) {
        pokernetwork.Servidor.cambioFase(pokernetwork.Servidor.juego);
    }
}