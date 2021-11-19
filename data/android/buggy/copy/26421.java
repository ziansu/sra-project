@org.junit.Before
public void resetLogging() {
    ch.qos.logback.classic.LoggerContext loggerContext = ((ch.qos.logback.classic.Logger) (org.slf4j.LoggerFactory.getLogger(getClass()))).getLoggerContext();
    loggerContext.reset();
    ch.qos.logback.classic.BasicConfigurator.configure(loggerContext);
}