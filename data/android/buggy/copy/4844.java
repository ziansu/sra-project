public void jsonEquals(org.json.JSONArray actual, org.json.JSONObject[] expected) {
    com.mbi.EqualityAsserter asserter = new com.mbi.EqualityAsserter();
    asserter.assertEquals(actual, asserter.objectsToArray(expected), mode, ignore);
    setDefault();
}