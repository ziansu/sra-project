private synchronized int getMatchingStubCount(java.lang.String url1, java.lang.String url2) {
    return com.google.common.collect.FluentIterable.from(wireMockServer.listAllStubMappings().getMappings()).filter(withAnyOf(url1, url2)).size();
}