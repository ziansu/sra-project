@com.google.common.annotations.VisibleForTesting
@java.lang.Override
public boolean hasType(co.cask.cdap.proto.Id.DatasetType datasetTypeId) {
    return (registries.containsKey(datasetTypeId.getNamespace())) && (registries.get(datasetTypeId.getNamespace()).hasType(datasetTypeId.getTypeName()));
}