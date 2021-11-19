public com.trinitcore.sql.queryObjects.returnableQueries.Table delete(java.lang.String whereColumn, java.lang.Object value) {
    new com.trinitcore.sql.queryObjects.noneReturnableQueries.Delete(this.table, whereColumn, value);
    reset(true);
    return this;
}