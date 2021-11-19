@org.junit.Test
public void shouldLeaveNormalWordAsIs() {
    java.util.List<java.lang.String> results = norm.createMappings("imbis");
    assertEquals(1, results.size());
    assertEquals("imbis", results.get(0));
}