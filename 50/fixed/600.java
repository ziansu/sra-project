private azkaban.execapp.FlowRunner createFlowRunner(final azkaban.execapp.EventCollectorListener eventCollector, final azkaban.executor.ExecutionOptions.FailureAction action) throws java.lang.Exception {
    return createFlowRunner(eventCollector, action, new azkaban.utils.Props());
}