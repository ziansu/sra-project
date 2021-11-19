@java.lang.Override
public org.mule.api.MuleEvent execute() throws java.lang.Exception {
    ((org.mule.DefaultMuleEvent) (event)).resetAccessControl();
    final org.mule.api.MuleEvent exceptionStrategyResult = exceptionListener.handleException(e, event);
    phaseResultNotifier.phaseSuccessfully();
    return exceptionStrategyResult;
}