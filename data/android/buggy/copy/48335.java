private com.google.cloud.dataflow.sdk.util.BigQueryServices getBigQueryServices() {
    if ((testBigQueryServices) != null) {
        return testBigQueryServices;
    }else {
        return new com.google.cloud.dataflow.sdk.util.BigQueryServicesImpl();
    }
}