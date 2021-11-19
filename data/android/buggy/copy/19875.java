public java.util.List<org.finra.herd.model.dto.TagTypeIndexSearchResponseDto> getTagTagIndexSearchResponseDto(io.searchbox.core.SearchResult searchResult) {
    io.searchbox.core.search.aggregation.MetricAggregation metricAggregation = searchResult.getAggregations();
    io.searchbox.core.search.aggregation.TermsAggregation tagTypeFacetAggregation = metricAggregation.getTermsAggregation(org.finra.herd.dao.helper.ElasticsearchHelper.TAG_TYPE_FACET_AGGS);
    return getTagTypeIndexSearchResponseDtosFromTermsAggregation(tagTypeFacetAggregation);
}