@org.junit.Test
public void testStormToStringNoCities() {
    stormPath.Storm s1 = new stormPath.Storm("Danielle", 2016);
    java.lang.String res = s1.toString();
    java.lang.String exp = "Danielle";
    assertEquals(exp, res);
}