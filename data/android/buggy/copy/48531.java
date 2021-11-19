private com.hazelcast.jet.impl.execution.CooperativeProcessorTasklet createTasklet() {
    final com.hazelcast.jet.impl.execution.CooperativeProcessorTasklet t = new com.hazelcast.jet.impl.execution.CooperativeProcessorTasklet(context, processor, instreams, outstreams, new com.hazelcast.jet.impl.execution.SnapshotContext(com.hazelcast.jet.config.ProcessingGuarantee.EXACTLY_ONCE), null);
    t.init(new java.util.concurrent.CompletableFuture<>());
    return t;
}