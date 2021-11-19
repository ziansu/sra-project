public org.polar.athena.service.IndexSummary getIndexSummary(int stockId) {
    this.checkIndexSummaryCache();
    return this.indexSummaryCache.get(stockId);
}