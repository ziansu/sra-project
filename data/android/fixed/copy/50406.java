@org.junit.Test(expected = java.lang.AssertionError.class)
public void testParseDateTime_unknownFormat() {
    com.google.cloud.tools.intellij.debugger.BreakpointUtil.parseDateTime("this is not a date");
}