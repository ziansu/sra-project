@java.lang.Override
public void continueProcess(org.apache.airavata.gfac.core.context.ProcessContext processContext, java.lang.String taskId) throws org.apache.airavata.gfac.core.GFacException {
    if (processContext.isInterrupted()) {
        org.apache.airavata.gfac.core.GFacUtils.handleProcessInterrupt(processContext);
        return ;
    }
    executeTaskListFrom(processContext, taskId);
}