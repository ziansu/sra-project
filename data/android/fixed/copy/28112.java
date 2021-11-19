public com.google.cloud.security.scanner.pipelines.LiveStateChecker build() {
    this.scannerDiffOutput = com.google.cloud.security.scanner.pipelines.LiveStateChecker.constructPipeline(this.pipeline, this.org, this.knownGoodSource);
    return this;
}