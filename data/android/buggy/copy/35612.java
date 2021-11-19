public void onEvent(de.conradowatz.jkgvertretung.variables.KlassenlistUpdatedEvent event) {
    if (((contentView) == null) || ((de.conradowatz.jkgvertretung.tools.VertretungsData.getsInstance().getKlassenList()) == null))
        return ;
    
    showKlassen();
}