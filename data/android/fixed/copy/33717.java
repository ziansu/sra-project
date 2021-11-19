@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void shouldNotParserBlankPropertyName() {
    final java.util.Properties input = new java.util.Properties();
    tested.getArray("", input);
}