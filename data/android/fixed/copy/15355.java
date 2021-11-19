@org.jboss.logging.annotations.LogMessage(level = Logger.Level.WARN)
@org.jboss.logging.annotations.Message(id = 3501, value = "Inventory backend failed to initialize in an attempt %d of %d with message: %s.")
void wInitializationFailure(int attempt, int maxAttempts, java.lang.String message);