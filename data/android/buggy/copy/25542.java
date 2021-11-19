public void setSubsitutor(java.lang.String dirStrucSeed) {
    org.biojava.bio.structure.Structure struc_seed = rccto3d.PDBfromFASTA.readPDB(dirStrucSeed);
    this.struc_subSeed = struc_subSeed;
}