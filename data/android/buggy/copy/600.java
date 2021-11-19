private azkaban.execapp.FlowRunner createFlowRunner(final azkaban.execapp.EventCollectorListener eventCollector, final java.lang.String flowName, final azkaban.executor.ExecutionOptions.FailureAction action) throws java.lang.Exception {
    return createFlowRunner(eventCollector, flowName, action, new azkaban.utils.Props());
}