private net.imagej.legacy.IJ1Helper ij1Helper() {
    if ((legacyService) instanceof net.imagej.legacy.LegacyService) {
        ij1Helper = legacyService.getIJ1Helper();
    }
    return ij1Helper;
}