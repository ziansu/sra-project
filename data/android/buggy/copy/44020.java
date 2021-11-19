public com.trinitcore.sql.queryObjects.returnableQueries.Table insert(com.trinitcore.sql.Map... maps) {
    new com.trinitcore.sql.queryObjects.noneReturnableQueries.Insert(this.table, maps);
    reset(false);
    return this;
}