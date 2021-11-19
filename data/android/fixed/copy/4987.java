public void GuardarPartida() throws java.sql.SQLException {
    partData.removePartida(partida);
    partida = partData.addPartida(partida);
    fichasData.addFichas(partida);
}