private <T extends com.mediamath.terminalone.models.T1Entity> java.lang.StringBuilder getUri(T entity) {
    java.lang.String entityName = entity.getEntityname();
    java.lang.StringBuilder uri = new java.lang.StringBuilder(Constants.entityPaths.get(entityName));
    return uri;
}