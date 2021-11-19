@org.junit.Test
public void testGetJsonName() {
    test.setJsonNameToPref("testJson.json");
    org.junit.Assert.assertThat(new java.lang.String(test.getJsonNameFromPref()), org.hamcrest.CoreMatchers.is("testJson.json"));
}