private boolean checkBatchEnd(org.apache.carbondata.core.scan.result.BatchResult batch) {
    return !((counter) < (batch.getSize()));
}