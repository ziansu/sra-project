@java.lang.Override
public void publish(java.util.logging.LogRecord logRecord) {
    io.vertx.core.impl.launcher.commands.LogCaptureHandler.ps.println(logRecord.getMessage());
    java.lang.System.err.println(("LOG:" + (logRecord.getMessage())));
}