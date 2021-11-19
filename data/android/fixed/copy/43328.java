@org.junit.Test
public void shouldRemoveAllPipes() {
    java.util.List<java.lang.String> results = norm.createMappings("bar|tu|c|h");
    assertEquals("bar|tu|c|h", results.get(0));
    assertEquals("bartuch", results.get(1));
}