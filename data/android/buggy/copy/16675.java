public static void exitCode(int exitCode) {
    interpreter.Display.display(("Exit code " + exitCode));
    java.lang.System.exit(exitCode);
}