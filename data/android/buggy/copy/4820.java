public com.trinitcore.sql.queryObjects.returnableQueries.Table update(java.lang.String whereColumn, java.lang.Object value, com.trinitcore.sql.Map... maps) {
    new com.trinitcore.sql.queryObjects.noneReturnableQueries.Update(this.table, whereColumn, value, maps);
    reset(true);
    return this;
}