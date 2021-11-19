private static com.dataartisans.flink.dataflow.FlinkTestPipeline create(boolean streaming) {
    com.dataartisans.flink.dataflow.FlinkPipelineRunner flinkRunner = com.dataartisans.flink.dataflow.FlinkPipelineRunner.createForTest(streaming);
    return new com.dataartisans.flink.dataflow.FlinkTestPipeline(flinkRunner, flinkRunner.getPipelineOptions());
}