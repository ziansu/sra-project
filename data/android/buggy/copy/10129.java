private static void processWordsByRow(java.util.List<java.lang.String> lines) {
    for (java.lang.String line : common.PDFContainer.words) {
        frontend.app.TextProcessor.countWordOccurence(line);
    }
}