public static de.zabuza.parbot.logging.ILogger getLogger() {
    if ((de.zabuza.parbot.logging.LoggerFactory.loggerInstance) == null) {
        de.zabuza.parbot.logging.LoggerFactory.loggerInstance = new de.zabuza.parbot.logging.HtmlLogger();
    }
    return de.zabuza.parbot.logging.LoggerFactory.loggerInstance;
}