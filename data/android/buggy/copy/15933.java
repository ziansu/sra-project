@org.junit.Test
public void preventMinIsGreaterThanMax() {
    thrown.expect(java.lang.IllegalArgumentException.class);
    thrown.expectMessage("max should be greater or equal to min.");
    io.opencensus.stats.AggregationData.DistributionData.create(1, 1, 10, 1, 0, 0, 1, 0);
}