public void closeStream() {
    try {
        writer.flush();
        writer.close();
        java.lang.Runtime.getRuntime().removeShutdownHook(shutdownHookThread);
    } catch (java.io.IOException e) {
        exceptionThrown(e);
        java.lang.System.err.println("Could not flush and/or close the stream.\nFor detailed information see stack trace.");
    }
}