public static void outputError(java.lang.Exception e, java.lang.String timeOccured) {
    if (!(comms.SmartWriter.stopPrintingErrors)) {
        java.lang.System.err.println((("Exception occured in: " + timeOccured) + "."));
        e.printStackTrace(java.lang.System.err);
        comms.SmartWriter.stopPrintingErrors = false;
    }
}