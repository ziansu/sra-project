@java.lang.Override
public void run() {
    try {
        report();
    } catch (java.lang.Throwable e) {
        org.springside.modules.metrics.report.ReportScheduler.logger.error(e.getMessage(), e);
    }
}