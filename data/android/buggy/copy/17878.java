public static java.io.ByteArrayOutputStream getNewStdoutObject() {
    java.io.ByteArrayOutputStream stdout2 = new java.io.ByteArrayOutputStream();
    java.io.PrintStream ps2 = new java.io.PrintStream(studenttester.classes.StudentHelperClass.stdoutStream);
    java.lang.System.setOut(ps2);
    return studenttester.classes.StudentHelperClass.stdoutStream;
}