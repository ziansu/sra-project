@java.lang.Override
public void surChangementDeDonnees(java.util.List<com.pam.codenamehippie.modele.UtilisateurModele> modeles) {
    if ((modeles != null) && ((modeles.size()) != 0)) {
        this.modele = modeles.get(0);
    }
}