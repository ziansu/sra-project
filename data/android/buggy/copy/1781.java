public void assertSelf(java.lang.String expectSpanId, java.lang.String expectHost) {
    org.junit.Assert.assertNotNull(getTraceContext());
    org.junit.Assert.assertThat(getTraceContext(), org.hamcrest.CoreMatchers.endsWith(((expectSpanId + "|") + expectHost)));
}