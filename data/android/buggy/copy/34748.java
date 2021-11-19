@java.lang.Override
public de.uni_hamburg.informatik.swt.se2.mediathek.materialien.VormerkKarte getVormerkKarteFuer(de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium medium) {
    assert mediumImBestand(medium) : "Vorbedingung verletzt: medienImBestand(medien)";
    de.uni_hamburg.informatik.swt.se2.mediathek.materialien.VormerkKarte vormerkKarte = null;
    try {
        vormerkKarte = _vormerkKarten.get(medium);
    } catch (java.lang.NullPointerException e) {
    }
    return vormerkKarte;
}