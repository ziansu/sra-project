public void run() {
    try {
        resourceBundler.generateResourceBundle();
    } catch (java.io.IOException e) {
        ch.silviowangler.i18n.cmd.CommandLineProcessor.LOGGER.error("Unable to generate resource bundle", e);
        java.lang.System.exit((-1));
    }
    ch.silviowangler.i18n.cmd.CommandLineProcessor.LOGGER.info("Successfully ended process");
}