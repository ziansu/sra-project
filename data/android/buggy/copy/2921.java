public double getAverageSizeInKb() {
    if ((size) == 0) {
        return 0;
    }
    return hudson.plugins.performance.PerformanceReport.roundTwoDecimals(((totalSizeInKB) / (size)));
}