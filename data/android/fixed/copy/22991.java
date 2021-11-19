@org.junit.Test
public void basics() {
    assertEquals(filter.Parser.parse(""), Qualifier.EMPTY);
}