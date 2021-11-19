public java.util.List<fr.treeptik.amazoneejb.pojo.Utilisateur> getUtilisateurs() {
    if (utilisateurs.isEmpty()) {
        utilisateurs = utilisateurService.findAll();
    }
    return utilisateurs;
}