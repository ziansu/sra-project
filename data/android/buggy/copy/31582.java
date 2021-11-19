public java.util.List<com.emc.vipr.client.core.ComputeVirtualPoolRestRep> getByVirtualArray(java.net.URI varrayId, com.emc.vipr.client.core.filters.ResourceFilter<com.emc.vipr.client.core.ComputeVirtualPoolRestRep> filter) {
    java.util.List<com.emc.storageos.model.NamedRelatedResourceRep> refs = listByVirtualArray(varrayId);
    return getByRefs(refs, filter);
}