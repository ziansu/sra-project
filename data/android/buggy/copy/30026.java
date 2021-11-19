@com.google.common.annotations.VisibleForTesting
void open(java.io.Reader reader) {
    pipelineRunner.stopAndAwait();
    this.pipeline.clear();
    this.xstream.fromXML(reader);
    pipelineRunner.startAsync();
    saveIsDirty = false;
}