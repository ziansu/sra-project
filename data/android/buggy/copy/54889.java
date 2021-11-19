private void assignAllRecords(org.deidentifier.arx.clustering.TassaCluster cluster) {
    for (final org.deidentifier.arx.clustering.TassaRecord record : cluster) {
        record.assignedCluster = this;
    }
}