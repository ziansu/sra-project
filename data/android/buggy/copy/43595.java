public boolean saveEntities(@java.lang.SuppressWarnings(value = "unchecked")
T... entities) {
    if (null == entities)
        return true;
    
    return saveEntities(java.util.Arrays.asList(entities));
}