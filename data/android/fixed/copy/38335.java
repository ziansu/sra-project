@java.lang.Override
public org.elasticsearch.search.aggregations.InternalAggregation buildEmptyAggregation() {
    return new org.scaleborn.elasticsearch.linreg.aggregation.stats.InternalStats(this.name, 0, null, null, pipelineAggregators(), metaData());
}