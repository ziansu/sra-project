@org.junit.Test
public void testTCO() throws wyvern.tools.parsing.coreparser.ParseException {
    java.lang.String input = "def f(n : Int) : Int\n" + (((("  (n < 0).ifTrue(\n" + "    () => 1,\n") + "    () => f(n-1)\n") + "  )\n") + "f(50000)\n");
    testPyFromInput(input, "1", true);
}