@org.junit.Test
public void testConstructor() {
    org.junit.Assert.assertNotNull(new org.nmdp.service.feature.resource.FeatureMixIn("locus", "term", 2, "ACTG"));
}