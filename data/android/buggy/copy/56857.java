@org.junit.Test
public void encodes() throws java.io.IOException {
    final org.takes.facets.auth.Identity identity = new org.takes.facets.auth.Identity.Simple("urn:test:3");
    org.hamcrest.MatcherAssert.assertThat(new java.lang.String(new org.takes.facets.auth.codecs.CcBase64(new org.takes.facets.auth.codecs.CcPlain()).encode(identity)), org.hamcrest.Matchers.equalTo("dXJuJTNBdGVzdCUzQTM="));
}