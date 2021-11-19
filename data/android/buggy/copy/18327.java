public void testNonCompatibilityMode() throws java.lang.Exception {
    java.lang.String jsonStructure = test(false);
    org.junit.Assert.assertTrue(jsonEquals(org.pentaho.di.trans.steps.enhanced.jsonoutput.JsonOutputTest.EXPECTED_NON_COMPATIBILITY_JSON, jsonStructure));
}