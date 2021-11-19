@java.lang.Override
public com.visenze.visearch.PagedSearchResult answer(org.mockito.invocation.InvocationOnMock invocationOnMock) throws java.lang.Throwable {
    com.visenze.visearch.PagedSearchResult result = new com.visenze.visearch.PagedSearchResult(null);
    result.setHeaders(com.google.common.collect.ImmutableMap.of("X-Log-ID", "11111"));
    return result;
}