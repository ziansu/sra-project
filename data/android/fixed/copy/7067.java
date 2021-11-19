@java.lang.Override
public com.netflix.astyanax.connectionpool.OperationResult<com.netflix.astyanax.model.ColumnList<java.lang.String>> readAsFields(java.lang.String gooruOid) {
    return getCassandraDao().readAsFields(gooruOid);
}