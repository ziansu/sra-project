public void setEtapes(java.util.List<org.findmyway.entity.Etape> etapes) throws java.lang.Exception {
    if ((etapes.size()) == 5)
        this.etapes = etapes;
    else
        throw new java.lang.Exception("Nombre d'etapes invalide");
    
}