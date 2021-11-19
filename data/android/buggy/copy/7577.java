private static org.springframework.batch.item.ExecutionContext getJobExecutionContext(org.springframework.batch.core.scope.context.ChunkContext chunkContext) {
    return chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext();
}