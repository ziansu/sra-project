private void normaliseAndCompare(java.lang.String expected, java.lang.String actual) {
    org.junit.Assert.assertEquals(expected.replaceAll("\\s+", ""), actual.replaceAll("\\s+", ""));
}