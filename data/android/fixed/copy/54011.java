public void copy(org.eclipse.ice.datastructures.form.emf.EMFTreeComposite otherTreeComposite) {
    if (otherTreeComposite == null) {
        return ;
    }
    ecoreNodeMetaData = otherTreeComposite.ecoreNodeMetaData;
    ecoreNode = org.eclipse.emf.ecore.util.EcoreUtil.create(ecoreNodeMetaData);
    super.copy(((org.eclipse.ice.datastructures.form.TreeComposite) (otherTreeComposite)), true);
    return ;
}