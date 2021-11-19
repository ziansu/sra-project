public java.lang.Boolean inSportelloOAttribuzioneR() {
    java.util.List intersezione = new java.util.ArrayList(attribuzioni);
    intersezione.retainAll(ufficiRiservatoUtente);
    return (ufficiRiservatoUtente.contains(sportello)) || ((intersezione.size()) > 0);
}