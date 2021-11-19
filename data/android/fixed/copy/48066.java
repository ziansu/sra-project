@java.lang.Override
public org.mule.api.MuleEvent execute() throws java.lang.Exception {
    final org.mule.api.MuleEvent exceptionStrategyResult = exceptionListener.handleException(e, event);
    phaseResultNotifier.phaseSuccessfully();
    return exceptionStrategyResult;
}