public io.github.utplsql.api.TestRunner addReporterList(java.util.List<io.github.utplsql.api.reporter.Reporter> reporterList) {
    if (reporterList != null)
        this.reporterList.addAll(reporterList);
    
    return this;
}