public static java.io.ByteArrayOutputStream getNewStdoutObject() {
    java.io.ByteArrayOutputStream stdout2 = new java.io.ByteArrayOutputStream();
    java.io.PrintStream ps2 = new java.io.PrintStream(stdout2);
    java.lang.System.setOut(ps2);
    return stdout2;
}