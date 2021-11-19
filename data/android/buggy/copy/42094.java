public void newRound() {
    idGanador = null;
    baraja.rebarajar();
    pool_fichas = 0;
    jugadas = new java.util.ArrayList<>();
    resetAL(HABLADO);
    resetAL(APOSTADO);
    resetAL(RECIBIDO);
}