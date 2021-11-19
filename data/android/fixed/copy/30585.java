private org.opencb.bionetdb.core.io.Rna createRNA(org.opencb.bionetdb.core.io.Species species) {
    org.opencb.bionetdb.core.io.Rna rna = new org.opencb.bionetdb.core.io.Rna();
    setPhysicalEntityCommonProperties(rna, species);
    return rna;
}