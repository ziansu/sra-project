public org.openlca.cloud.model.data.DatasetDescriptor getDescriptor() {
    if ((local) != null)
        return local.getDescriptor();
    
    return toDescriptor(remote);
}