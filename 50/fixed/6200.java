private java.lang.String getOperator(com.ottogroup.bi.metascope.index.SolrQueryParameter.FilterType filterType) {
    switch (filterType) {
        case AND :
            return "AND";
        case OR :
        case EXCLUSIVE :
        default :
            return "OR";
    }
}