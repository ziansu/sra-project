@java.lang.Override
public void handleTimeout(com.google.cloud.bigtable.grpc.scanner.ScanTimeoutException rte) throws com.google.cloud.bigtable.grpc.scanner.BigtableRetriesExhaustedException {
    if (((clock.currentTimeMillis()) - (lastResponseMs)) < (retryOptions.getReadPartialRowTimeoutMillis())) {
        return ;
    }else {
        retryOnTimeout(rte);
    }
}