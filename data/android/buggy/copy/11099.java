public int addAnfrage(Terminkalender.Termin termin, java.lang.String absender) {
    meldungen.add(new Terminkalender.Anfrage((absender + " lädt sie zu einem Termin ein"), termin, absender, meldungsCounter));
    (meldungsCounter)++;
    return (meldungsCounter) - 1;
}