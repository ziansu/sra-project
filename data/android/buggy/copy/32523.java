protected void adjustFeatureModel() {
    final de.ovgu.featureide.fm.core.base.IFeatureModel featureModelOfVariants = generateFeatureModelOfVariants();
    de.ovgu.featureide.migration.impl.SPLMigrationUtils.writeFeatureModelToDefaultFile(newProject, featureModelOfVariants);
}