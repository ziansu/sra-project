@java.lang.Override
public boolean hasType(co.cask.cdap.proto.Id.DatasetType datasetTypeId) throws co.cask.cdap.data2.dataset2.DatasetManagementException {
    if (registries.containsKey(datasetTypeId.getNamespace())) {
        return registries.get(datasetTypeId.getNamespace()).hasType(datasetTypeId.getTypeName());
    }
    return false;
}