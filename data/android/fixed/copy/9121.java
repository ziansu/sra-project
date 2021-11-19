public java.lang.Object clone() {
    org.eclipse.ice.datastructures.form.emf.EMFEntry entry = new org.eclipse.ice.datastructures.form.emf.EMFEntry(entryMetaData, org.eclipse.emf.ecore.util.EcoreUtil.create(entryMetaData.getEContainingClass()));
    entry.copy(this);
    return entry;
}