@org.junit.Test
public void macrodef() {
    java.lang.String input = "(# (conc a b) (cons a (cons b empty)))" + "(conc 2 3)";
    assertEquals(new com.tmathmeyer.interp.runtime.SlipRuntime(input, true).evaluate().toString(), "[[2, 3]]");
}