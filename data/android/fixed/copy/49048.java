@org.junit.Test
public void privateScopedClassesGetLeftAlone() throws java.io.IOException {
    testHelper.addInputLines("in/Test.java", "final class Test {", "  private static class Blah {", "    static class Bleh {", "      static void bleh() {}", "    }", "  }", "  private Test() {}", "}").expectUnchanged().doTest();
}