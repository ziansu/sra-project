public void setRueckzugebenderPreis(de.uni_hamburg.informatik.swt.se2.kino.fachwerte.Geld preis) {
    if ((preis.signum()) != (-1)) {
        _rueckzugebenderPreis.setText(("Rueckgabe: " + preis));
    }else {
        setRueckzugebenderPreis(false);
    }
}