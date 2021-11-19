@org.junit.Test
public void testLastLineCmdInScriptFile() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = "show databases;\nshow tables;";
    final java.lang.String EXPECTED_PATTERN = " testbeelinetable1 ";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}