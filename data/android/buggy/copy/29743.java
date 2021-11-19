@java.lang.Override
public void onFailure(java.lang.Throwable e) {
    org.sonar.server.es.BulkIndexer.LOGGER.error(("Fail to execute bulk index request: " + req), e);
    semaphore.release();
}