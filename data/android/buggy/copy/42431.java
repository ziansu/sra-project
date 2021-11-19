private boolean determineExecuteAsUser(azkaban.utils.Props sysProps, azkaban.utils.Props jobProps) {
    boolean isExecuteAsUser = sysProps.getBoolean(azkaban.jobExecutor.ProcessJob.EXECUTE_AS_USER, false);
    if (jobProps.containsKey(azkaban.jobExecutor.ProcessJob.EXECUTE_AS_USER_OVERRIDE))
        isExecuteAsUser = jobProps.getBoolean(azkaban.jobExecutor.ProcessJob.EXECUTE_AS_USER_OVERRIDE, false);
    
    return isExecuteAsUser;
}