public boolean atacar(business.entities.Personaje oponente, int energia) throws util.ApplicationException {
    if (energia > (getEnergiaActual())) {
        throw new util.ApplicationException("Energía insuficiente para realizar el ataque");
    }
    usarEnergia(energia);
    return oponente.recibirAtaque(energia);
}