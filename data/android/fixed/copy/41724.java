public static java.lang.String getSpecificNameMagasin(java.lang.String ref_Magasin) {
    model.Magasin mag = Magasin.find.where().like("ref_Magasin", ref_Magasin).findUnique();
    if (mag != null)
        return mag.getNom_Magasin();
    else
        return null;
    
}