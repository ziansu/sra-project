@java.lang.Override
public void run() {
    if ((applicationContext) != null) {
        applicationContext.close();
    }
    loggingSystemShutdownHandler.run();
}