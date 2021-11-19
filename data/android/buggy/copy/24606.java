public org.apache.beam.sdk.io.gcp.bigquery.StreamingInserts<DestinationT> withInsertRetryPolicy(org.apache.beam.sdk.io.gcp.bigquery.InsertRetryPolicy retryPolicy) {
    return new org.apache.beam.sdk.io.gcp.bigquery.StreamingInserts(createDisposition, dynamicDestinations, bigQueryServices, retryPolicy);
}