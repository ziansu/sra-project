public long getTotalNumDocument(java.lang.String ontologyIri) {
    try {
        return CACHED_TOTAL_WORD_COUNT.get(ontologyIri);
    } catch (java.util.concurrent.ExecutionException e) {
        new java.lang.RuntimeException(e.getMessage());
    }
    return 0;
}