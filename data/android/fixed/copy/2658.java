@java.lang.Override
protected void doExecute(org.quartz.JobExecutionContext context) throws java.lang.Exception {
    datex2DataService.handleUnhandledDatex2Messages();
}