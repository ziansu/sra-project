private Spiel.Spieler getIstAmZug() {
    if ((getHatBegonnen()) == false)
        throw new java.lang.RuntimeException("Spiel hat noch nicht gestartet!");
    
    return this.istAmZug;
}