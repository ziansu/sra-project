@java.lang.Override
protected void execute(org.elasticsearch.client.Client esClient, java.lang.String index, boolean verbose) {
    this.searchResponse = esClient.prepareSearch(index).setQuery(org.elasticsearch.index.query.QueryBuilders.matchAllQuery()).get();
    printResult();
}