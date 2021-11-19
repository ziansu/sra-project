@java.lang.Override
public void error(java.lang.String s) {
    if ((underlyingLogger) == null) {
        java.lang.System.err.println(s);
    }else {
        underlyingLogger.error(s);
    }
}