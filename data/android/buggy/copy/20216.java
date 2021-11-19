public void map(final java.lang.Object srcObj, final java.lang.Object destObj, final java.lang.String mapId) {
    org.dozer.util.MappingValidator.validateMappingRequest(srcObj, destObj);
    mapGeneral(srcObj, null, destObj, mapId);
}