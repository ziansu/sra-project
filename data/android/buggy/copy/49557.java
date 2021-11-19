@java.lang.Override
public void onSuccess(com.datastax.driver.core.ResultSet rs) {
    if (com.kryptnostic.datastore.util.Util.wasLightweightTransactionApplied(rs)) {
        putVertexLookup = true;
        putVertexIfAbsentAsync();
    }else {
        id = com.kryptnostic.datastore.cassandra.RowAdapters.vertexId(rs.one());
        isDone = true;
    }
}