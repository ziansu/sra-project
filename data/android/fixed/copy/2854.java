@org.junit.Test
public void testFormat() {
    java.lang.String result = instance.format(record);
    assertEquals(fullLogMessage, result);
}