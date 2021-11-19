private static com.dataartisans.flink.dataflow.FlinkTestPipeline create(boolean streaming) {
    com.dataartisans.flink.dataflow.FlinkPipelineRunner flinkRunner = com.dataartisans.flink.dataflow.FlinkPipelineRunner.createForTest(streaming);
    com.dataartisans.flink.dataflow.FlinkPipelineOptions pipelineOptions = flinkRunner.getPipelineOptions();
    pipelineOptions.setStreaming(streaming);
    return new com.dataartisans.flink.dataflow.FlinkTestPipeline(flinkRunner, pipelineOptions);
}