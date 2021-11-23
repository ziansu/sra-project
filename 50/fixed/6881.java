@org.junit.Test
public void splitWithConsecutiveDelimiters() {
    assertArrayEquals(new java.lang.String[]{ "foo" , "" , "bar" }, split("foo$$bar", '$'));
}