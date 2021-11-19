@java.lang.SuppressWarnings(value = "unchecked")
private <T> T[] createOrUpdateEntities(T... entities) {
    entities = pm.makePersistentAll(entities);
    return pm.detachCopyAll(entities);
}