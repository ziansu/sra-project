public static void assertEval(java.lang.String script, java.lang.Object expected) {
    org.junit.Assert.assertEquals(expected, org.libj.xquery.Compiler.eval(script));
}