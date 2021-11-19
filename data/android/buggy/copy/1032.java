public double getTotalTrafficInKb() {
    return hudson.plugins.performance.PerformanceReport.roundTwoDecimals(totalSizeInKB);
}