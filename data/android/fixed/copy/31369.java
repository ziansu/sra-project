private azkaban.execapp.FlowRunner createFlowRunner(final azkaban.execapp.EventCollectorListener eventCollector) throws java.lang.Exception {
    return createFlowRunner(eventCollector, FailureAction.FINISH_CURRENTLY_RUNNING);
}