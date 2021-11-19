@org.junit.Test
public void shouldLeaveNormalWordAsIs() {
    java.util.List<java.lang.String> results = norm.createMappings("imbis");
    assertEquals("imbis", results.get(0));
}