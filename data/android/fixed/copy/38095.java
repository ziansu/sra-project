protected org.ovirt.engine.core.common.businessentities.StorageDomain getStorageDomain() {
    if ((storageDomain) == null) {
        storageDomain = getStorageDomain(getProfile().getStorageDomainId());
    }
    return storageDomain;
}