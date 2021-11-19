private boolean isfucntion(java.util.Set<com.stratio.crossdata.common.statements.structures.Selector> selectors, java.lang.String... functionName) {
    for (com.stratio.crossdata.common.statements.structures.Selector selector : selectors) {
        if (com.stratio.connector.elasticsearch.core.engine.utils.SelectorUtils.isFunction(selector, functionName)) {
            return true;
        }
    }
    return false;
}