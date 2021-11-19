@org.junit.Ignore(value = "regression for issue 651, not yet fixed")
@org.junit.Test
public void regressionTestIssue651() throws java.lang.Exception {
    compilationHelper.addSourceLines("Foo.java", "class Foo {", "  void foo() {", "    Object[] values = null;", "    if (values[0] instanceof Integer) {", "      int x = (Integer) values[0];", "    } else if (values[0] instanceof Long) {", "      long y = (Long) values[0];", "    }", "  }", "}").doTest();
}