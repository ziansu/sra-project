@org.junit.Test
public void testBreakOnErrorScriptFile() throws java.lang.Throwable {
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    final java.lang.String SCRIPT_TEXT = "select * from abcdefg01;\nshow databases;\n";
    final java.lang.String EXPECTED_PATTERN = " default ";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, false, argList);
}