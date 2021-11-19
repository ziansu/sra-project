public void onKlassenListUpdated() {
    de.conradowatz.jkgvertretung.activities.MainActivity mainActivity = ((de.conradowatz.jkgvertretung.activities.MainActivity) (getActivity()));
    if ((mainActivity.vertretungsAPI.getKlassenList()) == null)
        return ;
    
    showKlassen(mainActivity.vertretungsAPI.getKlassenList());
}