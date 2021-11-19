public void outputPercentileDistribution(final java.io.PrintStream printStream, final int percentileTicksPerHalfDistance, final java.lang.Double outputValueUnitScalingRatio, final boolean useCsvFormat) {
    integerValuesHistogram.outputPercentileDistribution(printStream, percentileTicksPerHalfDistance, (outputValueUnitScalingRatio * (integerToDoubleValueConversionRatio)), useCsvFormat);
}