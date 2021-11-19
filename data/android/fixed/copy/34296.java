public java.util.List<fr.treeptik.amazoneejb.pojo.Utilisateur> getUtilisateurs() {
    utilisateurs = utilisateurService.findAll();
    return utilisateurs;
}