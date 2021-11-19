public void generateEntitiesFromArray(java.util.ArrayList _entityList, com.akura.parser.models.Entity ent, java.lang.String key) {
    for (java.lang.Object obj : _entityList) {
        resolveType(obj, ent, key);
    }
}