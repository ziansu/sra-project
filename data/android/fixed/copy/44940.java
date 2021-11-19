public static void addHandlers(java.util.logging.Logger logger) {
    if ((edu.isu.umls.logging.Log.fileHandler) == null) {
        edu.isu.umls.logging.Log.getLog();
    }else {
        logger.addHandler(edu.isu.umls.logging.Log.fileHandler);
        logger.addHandler(edu.isu.umls.logging.Log.consoleHandler);
    }
}