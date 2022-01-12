protected org.ovirt.engine.core.common.businessentities.storage.DiskImage getRepresentativeImage() {
    if (!(getImages().isEmpty())) {
        return getImages().get(0);
    }
    return null;
}