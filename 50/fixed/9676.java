public void logToFile(java.lang.String message) throws java.lang.Exception {
    java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(logFile, true));
    writer.write(message);
    writer.close();
}