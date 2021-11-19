@java.lang.Deprecated
public void delete(java.lang.String id) throws java.lang.Exception {
    org.elasticsearch.action.delete.DeleteResponse response = client.prepareDelete("productindex", "prindextype", id).execute().actionGet();
}