public static void getFiles(java.lang.String fileName, java.util.Set<java.lang.String> relatedHashtags, java.util.ArrayList<java.lang.String> transactions) {
    ExportToFile.printToCsv(fileName, relatedHashtags, transactions);
    ExportToFile.printToText(fileName, transactions);
}