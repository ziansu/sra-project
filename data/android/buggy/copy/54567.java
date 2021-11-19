public void jsonEquals(org.json.JSONObject actual, org.json.JSONObject expected) {
    com.mbi.EqualityAsserter asserter = new com.mbi.EqualityAsserter();
    asserter.assertEquals(actual, expected, mode, ignore);
    setDefault();
}