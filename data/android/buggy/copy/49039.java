public static org.deidentifier.arx.AttributeType.MicroAggregationFunction createGeometricMean(boolean ignoreMissingData) {
    return new org.deidentifier.arx.AttributeType.MicroAggregationFunction(new org.deidentifier.arx.framework.check.distribution.DistributionAggregateFunction.DistributionAggregateFunctionGeometricMean(ignoreMissingData), true, DataScale.INTERVAL, "Geometric mean");
}