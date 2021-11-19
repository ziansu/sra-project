public void commit() throws java.lang.Exception {
    entities.add(curEntity);
    curEntity.postInit(entities);
}