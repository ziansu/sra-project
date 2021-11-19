@java.lang.Override
boolean hasEntity(java.lang.Long id) {
    return tagFacadeGateway.isInTagCache(id);
}