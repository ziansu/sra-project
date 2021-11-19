@java.lang.Override
public void stop() {
    super.stop();
    counter.stop();
    org.apache.flume.source.taildirectory.DirectoryTailSource.logger.info("DirectoryTailSource {} stopped. Metrics: {}", getName(), counter);
    for (org.apache.flume.source.taildirectory.WatchDir watchDir : watchDirs) {
        watchDir.stop();
    }
}