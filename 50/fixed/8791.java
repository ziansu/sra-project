@java.lang.Override
protected void deleteMetadata(final org.eclipse.hawkbit.repository.model.DistributionSet entity, final java.lang.String key, final java.lang.String value) {
    distributionSetManagement.deleteDistributionSetMetadata(entity, key);
}