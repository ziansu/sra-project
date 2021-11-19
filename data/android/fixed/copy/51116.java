public long getTotalNumDocument(java.lang.String ontologyIri) {
    try {
        return CACHED_TOTAL_WORD_COUNT.get(ontologyIri);
    } catch (java.util.concurrent.ExecutionException e) {
        throw new java.lang.RuntimeException(e.getMessage());
    }
}