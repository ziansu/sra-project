public void generateReport() {
    com.github.lizardev.xquery.saxon.coverage.report.Report report = defaultCoverageInstructionEventHandler.getReport();
    new com.github.lizardev.xquery.saxon.coverage.report.StreamReportPrinter(java.lang.System.err).print(report);
    new com.github.lizardev.xquery.saxon.coverage.report.FileReportPrinter().print(report);
}