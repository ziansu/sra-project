@org.junit.Test
public void test_aggregator_sum_noSampling_valid() throws java.io.IOException, org.kairosdb.core.http.rest.QueryException {
    java.lang.String json = com.google.common.io.Resources.toString(com.google.common.io.Resources.getResource("invalid-query-metric-aggregators-sum-no-sampling.json"), com.google.common.base.Charsets.UTF_8);
    java.util.List<org.kairosdb.core.datastore.QueryMetric> queryMetrics = parser.parseQueryMetric(json);
}