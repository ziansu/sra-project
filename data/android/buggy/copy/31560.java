@java.lang.Override
public java.lang.Object getResult(java.lang.String joinId) {
    if (missingId.equals(joinId)) {
        return null;
    }
    return new org.apache.solr.search.xjoin.SimpleXJoinResultsFactory.Result(joinId, 0.5);
}