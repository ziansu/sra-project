public void closeApplication() {
    log.log(LogLevel.INFO, "Game shutting Down.");
    try {
        textFileHandler.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    this.primaryStage.close();
}