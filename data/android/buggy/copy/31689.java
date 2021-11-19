public static void closeLogFile() {
    if ((com.jboby93.markovbot.Logger.log) != null) {
        com.jboby93.markovbot.Logger.log.close();
        com.jboby93.markovbot.Logger.log((("closeLogFile(): log file " + (com.jboby93.markovbot.Logger.LOG_FILE_NAME)) + " closed"));
        com.jboby93.markovbot.Logger.log = null;
    }
}