@org.junit.Test
public void shouldFailWithIngestFailExceptionWhenNotFound() {
    createWiremockStub(java.net.HttpURLConnection.HTTP_NOT_FOUND);
    expectedEx.expect(IngestService.Failed.class);
    expectedEx.expectMessage("Failed, could not find URL you have given");
    ingestClient.ingest(createTimeSeriesDefinitionValid(), createTimeSeriesPointValid());
}