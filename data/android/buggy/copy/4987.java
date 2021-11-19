public void GuardarPartida() throws java.sql.SQLException {
    if ((partida.getIdPartida()) != (-1))
        partData.removePartida(partida);
    
    partida = partData.addPartida(partida);
    fichasData.addFichas(partida);
}