private void getMaterialsDatabase() {
    if ((bundleContext) != null) {
        matDBServiceRef = bundleContext.getServiceReference(org.eclipse.ice.materials.IMaterialsDatabase.class);
        org.eclipse.ice.materials.IMaterialsDatabase database = bundleContext.getService(matDBServiceRef);
        org.eclipse.ice.item.model.AbstractModelBuilder.setMaterialsDatabase(database);
    }
    return ;
}