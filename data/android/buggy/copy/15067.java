@java.lang.Override
public java.util.List<ovh.gorillahack.wazabi.domaine.Partie> afficherHistorique(ovh.gorillahack.wazabi.domaine.Joueur j) {
    java.util.List<ovh.gorillahack.wazabi.domaine.Partie> listeRenv = partieDaoImpl.afficherHistorique(j);
    return listeRenv;
}