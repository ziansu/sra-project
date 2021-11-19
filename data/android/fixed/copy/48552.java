@org.junit.Test
public void testcaesar() {
    ma.input = "asdf";
    ma.strn = "3";
    java.lang.String expected = "dvgi";
    assertEquals(ma.caesar(true), expected);
}