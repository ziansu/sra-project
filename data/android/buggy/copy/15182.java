@java.lang.Override
public de.uni_hamburg.informatik.swt.se2.mediathek.materialien.Verleihkarte getVerleihkarteFuer(de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium medium) {
    assert istVerliehen(medium) : "Vorbedingung verletzt: istVerliehen(medium)";
    return _verleihkarten.get(medium);
}